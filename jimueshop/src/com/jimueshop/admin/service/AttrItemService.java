package com.jimueshop.admin.service;

import java.util.List;
import java.util.Map;

import com.jimueshop.domain.AttrItem;
import com.jimueshop.domain.Page;

public interface AttrItemService {
	/**
	 * ��ȡָ��ҳ��������������Ϣ
	 * @param currentPage ҳ��
	 * @return Page����
	 */
	public Page queryAllAttrItemByPage(int currentPage ) ;
	/**
	 * ����������IDɾ��������
	 * @param attrItemId
	 */
	public void deleteAttrItemById(int attrItemId ) ;
	/**
	 * ͨ��������ID��ѯ������ 
	 * @param attrItemId
	 * @return
	 */
	public AttrItem queryAttrItemById(int attrItemId ) ;
	/**
	 * ����ID�б�����ɾ��������
	 * @param ids
	 */
	public void deleteManyAttrItemByIds(List<Integer> ids ) ;
	/**
	 * ͨ����������ģ����ѯ������
	 * @param params ��������--ֵӳ��
	 * @param currentPage 
	 * @return
	 */
	public Page querySomeAttrItemByProperties(int currentPage , Map<String , String > params ) ;
	/**
	 * ��������� 
	 * @param instance
	 */
	public void addAttrItem(AttrItem instance ) ;
	/**
	 * ����������
	 * @param instance
	 */
	public void updateAttrItem(AttrItem instance ) ;
	/**
	 * ��ѯĳһ���������е�������
	 * @param currentPage 
	 * @param attrId
	 * @return
	 */
	public Page queryAttrItemByAttrId( int currentPage , int attrId ) ;
}
