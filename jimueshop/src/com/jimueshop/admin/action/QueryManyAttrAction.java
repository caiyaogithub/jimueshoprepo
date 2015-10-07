package com.jimueshop.admin.action;

import java.util.Set;

import com.jimueshop.admin.service.AttrService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.Attr;
import com.jimueshop.domain.AttrItem;
import com.jimueshop.domain.Page;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description ͨ��С��id��ѯ���С���µ���������
 *
 * @author hello world
 *
 * @modifyTime 2015��10��6��
 */
public class QueryManyAttrAction extends ActionSupport {
	
	private Integer subTypeId ;
	
	private Integer currentPage ;
	
	private AttrService attrService ;
	
	private Page page ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;

	@Override
	public String execute() throws Exception {
		
		page = attrService.queryAttrBySubTypeId(currentPage, subTypeId) ;
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
		
	}

	public Page getPage() {
		return page;
	}

	public String getResult() {
		return result;
	}

	public void setSubTypeId(Integer subTypeId) {
		this.subTypeId = subTypeId;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public void setAttrService(AttrService attrService) {
		this.attrService = attrService;
	}
}
