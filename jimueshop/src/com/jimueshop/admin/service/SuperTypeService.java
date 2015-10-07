package com.jimueshop.admin.service;

import java.util.List;
import java.util.Map;

import com.jimueshop.domain.SuperType;
import com.jimueshop.domain.Page;

public interface SuperTypeService {
	/**
	 * ��ȡָ��ҳ�����д�����Ϣ
	 * @param currentPage ҳ��
	 * @return Page����
	 */
	public Page queryAllSuperTypeByPage(int currentPage ) ;
	/**
	 * ���ݴ���IDɾ������
	 * @param superTypeId
	 */
	public void deleteSuperTypeById(int superTypeId ) ;
	/**
	 * ͨ������ID��ѯ���� 
	 * @param superTypeId
	 * @return
	 */
	public SuperType querySuperTypeById(int superTypeId ) ;
	/**
	 * ����ID�б�����ɾ������
	 * @param ids
	 */
	public void deleteManySuperTypeByIds(List<Integer> ids ) ;
	/**
	 * ͨ��������ģ����ѯ����
	 * @param params ������--ֵӳ��
	 * @param currentPage 
	 * @return
	 */
	public Page querySomeSuperTypeByProperties(int currentPage , Map<String , String > params ) ;
	/**
	 * ��Ӵ��� 
	 * @param instance
	 */
	public void addSuperType(SuperType instance ) ;
	/**
	 * ���´���
	 * @param instance
	 */
	public void updateSuperType(SuperType instance ) ;
	/**
	 * �����������ݿ����Ƿ��Ѿ�����
	 * @param superTypeName
	 * @return
	 */
	public boolean checkSuperTypeNameExist(String superTypeName ) ;
}
