package com.jimueshop.admin.service.impl;

import java.util.List;
import java.util.Map;

import com.jimueshop.admin.dao.ProductDao;
import com.jimueshop.admin.dao.SubTypeDao;
import com.jimueshop.admin.service.ProductService;
import com.jimueshop.domain.Product;
import com.jimueshop.domain.Page;
import com.jimueshop.domain.SubType;

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
	
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao ;
	}
}
