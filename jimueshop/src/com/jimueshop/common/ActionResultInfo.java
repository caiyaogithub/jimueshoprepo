package com.jimueshop.common;
/**
 * 
 * @description 定义action返回的result字段值表示的含义
 *
 * @author hello world
 *
 * @modifyTime 2015年10月4日
 */
public interface ActionResultInfo {
	/**
	 * 请求参数有误
	 */
	String PARAMS_ERROR = "paramsError" ;  
	/**
	 * 操作成功
	 */
	String SUCCESS = "success" ;  
	
	/**
	 *  发送的订单状态不正确 
	 */
	String ORDER_STATUS_ERROR = "orderStatusError" ;
	/**
	 * 用户不存在
	 */
	String USER_NOT_EXIST = "userNotExist" ;
	/**
	 * 数据库中存在该大类名
	 */
	String SUPER_TYPE_EXIST = "superTypeExist" ;
	/**
	 * 数据库中不存在该大类名
	 */
	String SUPER_TYPE_NOTEXIST = "superTypeNotExist" ;
	/**
	 * 数据库中存在该小类名
	 */
	String SUB_TYPE_EXIST = "subTypeExist" ;
	/**
	 * 数据库中不存在该小类名
	 */
	String SUB_TYPE_NOTEXIST = "subTypeNotExist" ;
}
