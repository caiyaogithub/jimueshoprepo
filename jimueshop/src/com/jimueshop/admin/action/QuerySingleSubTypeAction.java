package com.jimueshop.admin.action;

import com.jimueshop.admin.service.SubTypeService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.SubType;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description 查询单个小类详细信息
 *
 * @author hello world
 *
 * @modifyTime 2015年10月4日
 */
public class QuerySingleSubTypeAction extends ActionSupport {
	
	private Integer id ;
	
	private SubTypeService subTypeService ;
	
	private SubType subType ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;

	@Override
	public String execute() throws Exception {
		
		subType = subTypeService.querySubTypeById(id) ;
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
		
	}
	
	public SubType getSubType() {
		return subType;
	}

	public String getResult() {
		return result;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setSubTypeService(SubTypeService subTypeService) {
		this.subTypeService = subTypeService;
	}
	
}
