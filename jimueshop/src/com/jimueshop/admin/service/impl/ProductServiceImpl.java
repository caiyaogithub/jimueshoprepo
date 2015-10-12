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
	public void addProduct(Product instance) {
		
		 productDao.save(instance) ;
		
	}
	@Override
	public void updateProduct(Product instance) {
		// 如果商品值没有变化则不会生成update语句
		productDao.update(instance) ;
		
	}
	@Override
	public boolean checkProductNameExist(String productName) {
		
		if(productDao.findByPropertyWithSingleValue("productName", productName).size() != 0 ){
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
		/*from Product as p 
		where 
		((from AttrItem where id in ('32')) in elements(p.attrItems))  
		and
		(from AttrItem where id in ('31')) in elements(p.attrItems)  
		and 
		(price >= 0 and price <= 6) 
		and
		(x >= 0 and x <= 6)*/
		
		String baseHql = "from Product as p " ;
		/*************AttrItem筛选条件HQL子句**************/
		String attrItemHql = "" ;
		for(int id : attrItemIds){
			attrItemHql += String.format("((from AttrItem where id in ('%d')) in elements(p.attrItems))", id ) + " and " ;
		}
		attrItemHql = attrItemHql.substring(0 , attrItemHql.lastIndexOf("and")) ;
		/************非AttrItem筛选条件HQL子句*************/
		String extraConditionHql = "" ;
		for(Map.Entry<String, String> entry : extraParams.entrySet() ){
			extraConditionHql += 
					String.format("(%s >= %d and %s <= %d)",
					entry.getKey(),
					Integer.parseInt(entry.getValue().split("-")[0]),
					entry.getKey(),
					Integer.parseInt(entry.getValue().split("-")[1])) + " and " ;
		}
		extraConditionHql = extraConditionHql.substring(0, extraConditionHql.lastIndexOf("and")) ;
		/***************最终HQL拼装********************/
		String hql = baseHql + (attrItemHql.equals("")?"":" where "+attrItemHql) 
							 + (attrItemHql.equals("")?(extraConditionHql.equals("")?"":" where "+extraConditionHql):(extraConditionHql.equals("")?"":"and"+extraConditionHql)) ;
		System.out.println("queryProductByAttrItem hql is : " + hql ) ; 
		
		return productDao.getPageReady(currentPage, hql) ;
 	}
	@Override
	public void changeProductImgPath(int productId, String newPicturePath) {
		
		Product product = productDao.findById(productId) ;
		
		product.setPicturePath(newPicturePath) ;
	}
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao ;
	}
}
