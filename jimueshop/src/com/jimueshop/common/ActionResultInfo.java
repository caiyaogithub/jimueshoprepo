package com.jimueshop.common;
/**
 * 
 * @description ����action���ص�result�ֶ�ֵ��ʾ�ĺ���
 *
 * @author hello world
 *
 * @modifyTime 2015��10��4��
 */
public interface ActionResultInfo {
	/**
	 * �����������
	 */
	String PARAMS_ERROR = "paramsError" ;  
	/**
	 * �����ɹ�
	 */
	String SUCCESS = "success" ;  
	
	/**
	 *  ���͵Ķ���״̬����ȷ 
	 */
	String ORDER_STATUS_ERROR = "orderStatusError" ;
	/**
	 * �û�������
	 */
	String USER_NOT_EXIST = "userNotExist" ;
	/**
	 * ���ݿ��д��ڸô�����
	 */
	String SUPER_TYPE_EXIST = "superTypeExist" ;
	/**
	 * ���ݿ��в����ڸô�����
	 */
	String SUPER_TYPE_NOTEXIST = "superTypeNotExist" ;
	/**
	 * ���ݿ��д��ڸ�С����
	 */
	String SUB_TYPE_EXIST = "subTypeExist" ;
	/**
	 * ���ݿ��в����ڸ�С����
	 */
	String SUB_TYPE_NOTEXIST = "subTypeNotExist" ;
}
