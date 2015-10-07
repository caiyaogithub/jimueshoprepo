package com.jimueshop.admin.service;

import java.util.List;
import java.util.Map;

import com.jimueshop.domain.Attr;
import com.jimueshop.domain.Page;

public interface AttrService {
	/**
	 * ��ȡָ��ҳ������������Ϣ
	 * @param currentPage ҳ��
	 * @return Page����
	 */
	public Page queryAllAttrByPage(int currentPage ) ;
	/**
	 * ��������IDɾ������
	 * @param attrId
	 */
	public void deleteAttrById(int attrId ) ;
	/**
	 * ͨ������ID��ѯ���� 
	 * @param attrId
	 * @return
	 */
	public Attr queryAttrById(int attrId ) ;
	/**
	 * ����ID�б�����ɾ������
	 * @param ids
	 */
	public void deleteManyAttrByIds(List<Integer> ids ) ;
	/**
	 * ͨ��������ģ����ѯ����
	 * @param params ������--ֵӳ��
	 * @param currentPage 
	 * @return
	 */
	public Page querySomeAttrByProperties(int currentPage , Map<String , String > params ) ;
	/**
	 * ������� 
	 * @param instance
	 */
	public void addAttr(Attr instance ) ;
	/**
	 * ��������
	 * @param instance
	 */
	public void updateAttr(Attr instance ) ;
	/**
	 * ������������ݿ����Ƿ��Ѿ�����
	 * @param attrName
	 * @return
	 */
	public boolean checkAttrNameExist(String attrName ) ;
	/**
	 * ��ѯĳһС�������е�����
	 * @param currentPage 
	 * @param subTypeId
	 * @return
	 */
	public Page queryAttrBySubTypeId( int currentPage , int subTypeId ) ;
}
