package com.jimueshop.admin.action;

import com.jimueshop.admin.service.SuperTypeService;
import com.jimueshop.common.ActionResultInfo;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description ���������Ƿ����
 *
 * @author hello world
 *
 * @modifyTime 2015��10��4��
 */
/**
 * 
 * @description ���������Ƿ����
 *
 * @author hello world
 *
 * @modifyTime 2015��10��4��
 */
public class CheckSuperTypeNameAction extends ActionSupport {
	
	private String superTypeName ;
	
	private SuperTypeService superTypeService ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;

	@Override
	public String execute() throws Exception {
		
		if( superTypeService.checkSuperTypeNameExist(superTypeName) ){
			
			result = ActionResultInfo.SUPER_TYPE_EXIST ;
			
		}else{
			
			result = ActionResultInfo.SUPER_TYPE_NOTEXIST ;
			
		}
		
		return SUCCESS ;
	}
	
	public String getResult() {
		return result;
	}

	public void setSuperTypeName(String superTypeName) {
		this.superTypeName = superTypeName;
	}

	public void setSuperTypeService(SuperTypeService superTypeService) {
		this.superTypeService = superTypeService;
	} 
	
}
