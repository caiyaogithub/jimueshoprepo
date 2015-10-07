package com.jimueshop.admin.action;

import com.jimueshop.admin.service.SuperTypeService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.SuperType;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description 添加和修改大类
 *
 * @author hello world
 *
 * @modifyTime 2015年10月4日
 */
public class AddOrModifySuperTypeAction extends ActionSupport {
	
	private SuperType superType ;
	
	private String operator ; // 标示做什么操作： 添加 --- 1   or 更新  ---2  
	
	private SuperTypeService superTypeService ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;

	@Override
	public String execute() throws Exception {
		
		if(operator.trim().equals("1")){
			
			superTypeService.addSuperType(superType) ;
			
		}else{
			
			superTypeService.updateSuperType(superType) ;
			
		}
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
	}

	public String getResult() {
		return result;
	}

	public void setSuperType(SuperType superType) {
		this.superType = superType;
	}

	public SuperType getSuperType() {
		return superType;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public void setSuperTypeService(SuperTypeService superTypeService) {
		this.superTypeService = superTypeService;
	}
}
