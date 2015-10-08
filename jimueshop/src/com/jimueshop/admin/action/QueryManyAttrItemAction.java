package com.jimueshop.admin.action;

import com.jimueshop.admin.service.AttrItemService;
import com.jimueshop.admin.service.AttrService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.Page;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description ͨ������id��ѯ��������µ�����������
 *
 * @author hello world
 *
 * @modifyTime 2015��10��6��
 */
public class QueryManyAttrItemAction extends ActionSupport {
	
	private Integer attrId ;
	
	private Integer currentPage ;
	
	private AttrItemService attrItemService ;
	
	private Page page ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;

	@Override
	public String execute() throws Exception {
		
		page = attrItemService.queryAttrItemByAttrId(currentPage, attrId) ;
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
		
	}

	public Page getPage() {
		return page;
	}

	public String getResult() {
		return result;
	}

	public void setAttrId(Integer attrId) {
		this.attrId = attrId;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public void setAttrItemService(AttrItemService attrItemService) {
		this.attrItemService = attrItemService;
	}
}
