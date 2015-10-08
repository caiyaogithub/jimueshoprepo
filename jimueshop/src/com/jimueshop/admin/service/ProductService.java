package com.jimueshop.admin.service;

import java.util.List;
import java.util.Map;

import com.jimueshop.domain.Product;
import com.jimueshop.domain.Page;

public interface ProductService {
	/**
	 * ��ȡָ��ҳ��������Ʒ��Ϣ
	 * @param currentPage ҳ��
	 * @return Page����
	 */
	public Page queryAllProductByPage(int currentPage ) ;
	/**
	 * ������ƷIDɾ����Ʒ
	 * @param productId
	 */
	public void deleteProductById(int productId ) ;
	/**
	 * ͨ����ƷID��ѯ��Ʒ 
	 * @param productId
	 * @return
	 */
	public Product queryProductById(int productId ) ;
	/**
	 * ����ID�б�����ɾ����Ʒ
	 * @param ids
	 */
	public void deleteManyProductByIds(List<Integer> ids ) ;
	/**
	 * ͨ��������ģ����ѯ��Ʒ
	 * @param params ������--ֵӳ��
	 * @param currentPage 
	 * @return
	 */
	public Page querySomeProductByProperties(int currentPage , Map<String , String > params ) ;
	/**
	 * �����Ʒ 
	 * @param instance
	 */
	public void addProduct(Product instance ) ;
	/**
	 * ������Ʒ
	 * @param instance
	 */
	public void updateProduct(Product instance ) ;
	/**
	 * �����Ʒ�����ݿ����Ƿ��Ѿ�����
	 * @param productName
	 * @return
	 */
	public boolean checkProductNameExist(String productName ) ;
	/**
	 * ��ѯĳһС�������е���Ʒ
	 * @param currentPage 
	 * @param subTypeId
	 * @return
	 */
	public Page queryProductBySubTypeId( int currentPage , int subTypeId ) ;
}
