package com.jimueshop.admin.service;

import java.util.List;
import java.util.Map;

import com.jimueshop.domain.AttrItem;
import com.jimueshop.domain.Page;
import com.jimueshop.domain.Product;

public interface ProductService {
	/**
	 * 获取指定页的所有商品信息
	 * @param currentPage 页数
	 * @return Page对象
	 */
	public Page queryAllProductByPage(int currentPage ) ;
	/**
	 * 根据商品ID删除商品
	 * @param productId
	 */
	public void deleteProductById(int productId ) ;
	/**
	 * 通过商品ID查询商品 
	 * @param productId
	 * @return
	 */
	public Product queryProductById(int productId ) ;
	/**
	 * 根据ID列表批量删除商品
	 * @param ids
	 */
	public void deleteManyProductByIds(List<Integer> ids ) ;
	/**
	 * 通过多属性模糊查询商品
	 * @param params 属性名--值映射
	 * @param currentPage 
	 * @return
	 */
	public Page querySomeProductByProperties(int currentPage , Map<String , String > params ) ;
	/**
	 * 添加商品 
	 * @param instance
	 */
	public void addProduct(Product instance ) ;
	/**
	 * 更新商品
	 * @param instance
	 */
	public void updateProduct(Product instance ) ;
	/**
	 * 检查商品名数据库中是否已经存在
	 * @param productName
	 * @return
	 */
	public boolean checkProductNameExist(String productName ) ;
	/**
	 * 查询某一小类下所有的商品
	 * @param currentPage 
	 * @param subTypeId
	 * @return
	 */
	public Page queryProductBySubTypeId( int currentPage , int subTypeId ) ;
	/**
	 * 根据属性查找商品列表
	 * @param currentPage 要查询的当前页
	 * @param attrItemIds 无需范围的属性: 在ATTR_ITEM表中存储的属性
	 * @param extraParams 需要范围的属性: 例如价格范围，暂时还没有想到其他的属性
	 * 					  格式： 键为属性名，例如"price"， 值为起始和结束属性值，例如：100-200
	 * @return
	 */
	public Page queryProductByAttrItem(int currentPage , List<Integer> attrItemIds ,  Map<String , String> extraParams ) ;
}
