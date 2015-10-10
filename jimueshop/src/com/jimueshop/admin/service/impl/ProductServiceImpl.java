package com.jimueshop.admin.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.jimueshop.admin.dao.ProductDao;
import com.jimueshop.admin.service.ProductService;
import com.jimueshop.common.StringUtil;
import com.jimueshop.domain.Page;
import com.jimueshop.domain.Product;

public class ProductServiceImpl implements ProductService {
	
	private ProductDao productDao ;
	
	@Override
	public Page queryAllProductByPage(int currentPage) {
		return productDao.getPageReady(currentPage, "from Product" ) ;
	}

	@Override
	public void deleteProductById(int productId) {
		Product product = queryProductById(productId) ;
		productDao.delete(product) ;
	}

	@Override
	public Product queryProductById(int productId) {
		return productDao.findById(productId) ;
	}
	@Override
	public void deleteManyProductByIds(List<Integer> ids) {
		productDao.deleteByPropertyWithMethod("id", ids ) ;
	}
	@Override
	public Page querySomeProductByProperties(int currentPage , Map<String, String> params) {
		return productDao.findByProperties(currentPage, params) ;
	}
	@Override
	public int addProduct(Product instance) {
		
		return (Integer) productDao.save(instance) ;
		
	}
	@Override
	public void updateProduct(Product instance) {
		// 如果商品值没有变化则不会生成update语句
		productDao.update(instance) ;
		
	}
	@Override
	public boolean checkProductNameExist(String productName) {
		
		if(productDao.findByProperty("productName", productName).size() != 0 ){
			return true ;
		}else{
			return false ;
		}
	}
	@Override
	public Page queryProductBySubTypeId(int currentPage, int subTypeId) {
		
		String hql = String.format( "from Product where subType.id = '%s' " , subTypeId )  ;
		
		return productDao.getPageReady(currentPage, hql) ;
		
	}
	@Override
	public Page queryProductByAttrItem(int currentPage , List<Integer> attrItemIds , Map<String , String > extraParams ) {
		/*from Group as g  inner join g.persons as p  where p.name=?*/
		String inClause = "" ;
		for(Object o : attrItemIds ){
			inClause += String.format("'%s',", o.toString()) ;
		}
		inClause = inClause.substring(0, inClause.lastIndexOf(",")) ;
		
		String whereClause = "" ;
		if(extraParams != null ){
			List<String> whereClauseList = new ArrayList<String>() ;
			for(Map.Entry<String, String> entry : extraParams.entrySet() ){
				String key = entry.getKey() ;
				String value = entry.getValue() ;
				int minPrice = Integer.valueOf(value.split("-")[0]) ;
				int maxPrice = Integer.valueOf(value.split("-")[1]) ;
				whereClauseList.add(String.format("(%s >= %d and %s <= %d)", key , minPrice , key , maxPrice )) ;
			}
			whereClause =" and " + StringUtil.concateWithChar(whereClauseList, " and ") ;
		}
		
		String hql = 
				String.format(
						"from Product as p where (from AttrItem where id in (%s)) in elements(p.attrItems) %s " , 
						inClause , whereClause ) ;
		
		System.out.println("queryProductByAttrItem hql : " + hql ) ;
		
		return productDao.getPageReady(currentPage, hql) ;
		
 	}
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao ;
	}
}
