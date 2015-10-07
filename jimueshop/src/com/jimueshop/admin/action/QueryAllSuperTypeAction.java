package com.jimueshop.admin.action;

import com.jimueshop.admin.service.SuperTypeService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.Page;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description 查询所有大类
 *
 * @author hello world
 *
 * @modifyTime 2015年10月4日
 */
public class QueryAllSuperTypeAction extends ActionSupport {
	
	private Integer currentPage ;
	
	private SuperTypeService superTypeService ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;
	
	private Page page ;

	
	@Override
	public String execute() throws Exception {
		
		page = superTypeService.queryAllSuperTypeByPage(currentPage) ;
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
		
	}
	
	public String getResult() {
		return result;
	}

	public Page getPage() {
		return page;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public void setSuperTypeService(SuperTypeService superTypeService) {
		this.superTypeService = superTypeService;
	}
}
