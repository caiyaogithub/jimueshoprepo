package com.jimueshop.admin.action;

import java.util.List;

import com.jimueshop.admin.service.SubTypeService;
import com.jimueshop.common.ActionResultInfo;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description 删除小类
 *
 * @author hello world
 *
 * @modifyTime 2015年10月1日
 */
public class DeleteSubTypeAction extends ActionSupport {
	
	private SubTypeService subTypeService ;
	
	private List<Integer> idList  ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;
	
	
	@Override
	public String execute() throws Exception {
		
			subTypeService.deleteManySubTypeByIds(idList) ;
			
			result = ActionResultInfo.SUCCESS ;
			
		return SUCCESS ;		
	}
	
	public String getResult() {
		return result;
	}
	public void setSubTypeService(SubTypeService subTypeService) {
		this.subTypeService = subTypeService;
	}

	public void setIdList(List<Integer> idList) {
		this.idList = idList;
	}
}
