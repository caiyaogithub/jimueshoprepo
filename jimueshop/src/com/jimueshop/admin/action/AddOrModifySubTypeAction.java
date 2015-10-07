package com.jimueshop.admin.action;

import com.jimueshop.admin.service.SubTypeService;
import com.jimueshop.admin.service.SuperTypeService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.SubType;
import com.jimueshop.domain.SuperType;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description ��Ӻ��޸�С��
 *
 * @author hello world
 *
 * @modifyTime 2015��10��4��
 */
public class AddOrModifySubTypeAction extends ActionSupport {
	
	private SubType subType ;
	
	private String operator ; // ��ʾ��ʲô������ ��� --- 1   or ����  ---2  
	
	private SubTypeService subTypeService ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;

	@Override
	public String execute() throws Exception {
		
		if(operator.trim().equals("1")){
			
			subTypeService.addSubType(subType) ;
			
		}else{
			
			subTypeService.updateSubType(subType) ;
			
		}
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
	}

	public String getResult() {
		return result;
	}

	public void setSubType(SubType subType) {
		this.subType = subType;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public void setSubTypeService(SubTypeService subTypeService) {
		this.subTypeService = subTypeService;
	}

	public SubType getSubType() {
		return subType;
	}
}
