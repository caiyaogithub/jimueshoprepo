package com.jimueshop.admin.action;

import java.util.List;

import com.jimueshop.admin.service.SuperTypeService;
import com.jimueshop.common.ActionResultInfo;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description 删除大类
 *
 * @author hello world
 *
 * @modifyTime 2015年10月1日
 */
public class DeleteSuperTypeAction extends ActionSupport {
	
	private SuperTypeService superTypeService ;
	
	private List<Integer> idList  ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;
	
	
	@Override
	public String execute() throws Exception {
		
			superTypeService.deleteManySuperTypeByIds(idList) ;
			
			result = ActionResultInfo.SUCCESS ;
			
		return SUCCESS ;		
	}
	
	public String getResult() {
		return result;
	}
	public void setSuperTypeService(SuperTypeService superTypeService) {
		this.superTypeService = superTypeService;
	}

	public void setIdList(List<Integer> idList) {
		this.idList = idList;
	}
}
