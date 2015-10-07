package com.jimueshop.admin.service;

import java.util.List;
import java.util.Map;

import com.jimueshop.domain.SubType;
import com.jimueshop.domain.Page;

public interface SubTypeService {
	/**
	 * ��ȡָ��ҳ������С����Ϣ
	 * @param currentPage ҳ��
	 * @return Page����
	 */
	public Page queryAllSubTypeByPage(int currentPage ) ;
	/**
	 * ����С��IDɾ��С��
	 * @param subTypeId
	 */
	public void deleteSubTypeById(int subTypeId ) ;
	/**
	 * ͨ��С��ID��ѯС�� 
	 * @param subTypeId
	 * @return
	 */
	public SubType querySubTypeById(int subTypeId ) ;
	/**
	 * ����ID�б�����ɾ��С��
	 * @param ids
	 */
	public void deleteManySubTypeByIds(List<Integer> ids ) ;
	/**
	 * ͨ��������ģ����ѯС��
	 * @param params ������--ֵӳ��
	 * @param currentPage 
	 * @return
	 */
	public Page querySomeSubTypeByProperties(int currentPage , Map<String , String > params ) ;
	/**
	 * ���С�� 
	 * @param instance
	 */
	public void addSubType(SubType instance ) ;
	/**
	 * ����С��
	 * @param instance
	 */
	public void updateSubType(SubType instance ) ;
	/**
	 * ���С�������ݿ����Ƿ��Ѿ�����
	 * @param subTypeName
	 * @return
	 */
	public boolean checkSubTypeNameExist(String subTypeName ) ;
	/**
	 * ��ѯĳһ���������е�С��
	 * @param currentPage 
	 * @param superTypeId
	 * @return
	 */
	public Page querySubTypeBySuperTypeId( int currentPage , int superTypeId ) ;
}
