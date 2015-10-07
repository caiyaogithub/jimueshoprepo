package com.jimueshop.admin.action;

import com.jimueshop.admin.service.SubTypeService;
import com.jimueshop.common.ActionResultInfo;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description 检查小类名是否存在
 *
 * @author hello world
 *
 * @modifyTime 2015年10月4日
 */
public class CheckSubTypeNameAction extends ActionSupport {
	
	private String subTypeName ;
	
	private SubTypeService subTypeService ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;

	@Override
	public String execute() throws Exception {
		
		if( subTypeService.checkSubTypeNameExist(subTypeName) ){
			
			result = ActionResultInfo.SUB_TYPE_EXIST ;
			
		}else{
			
			result = ActionResultInfo.SUB_TYPE_NOTEXIST ;
			
		}
		
		return SUCCESS ;
	}
	
	public String getResult() {
		return result;
	}

	public void setSubTypeName(String subTypeName) {
		this.subTypeName = subTypeName;
	}

	public void setSubTypeService(SubTypeService subTypeService) {
		this.subTypeService = subTypeService;
	} 
	
}
