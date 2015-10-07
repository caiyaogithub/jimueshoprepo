package com.jimueshop.admin.action;

import com.jimueshop.admin.service.SubTypeService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.Page;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description ͨ������id��ѯ��������µ�����С��
 *
 * @author hello world
 *
 * @modifyTime 2015��10��6��
 */
public class QueryManySubTypeAction extends ActionSupport {
	
	private Integer superTypeId ;
	
	private Integer currentPage ;
	
	private SubTypeService subTypeService ;
	
	private Page page ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;

	@Override
	public String execute() throws Exception {
		
		page = subTypeService.querySubTypeBySuperTypeId(currentPage, superTypeId) ;
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
		
	}
	
	public Page getPage() {
		return page;
	}

	public String getResult() {
		return result;
	}

	public void setSuperTypeId(Integer superTypeId) {
		this.superTypeId = superTypeId;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public void setSubTypeService(SubTypeService subTypeService) {
		this.subTypeService = subTypeService;
	}
}
