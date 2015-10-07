package com.jimueshop.admin.action;

import java.util.Map;

import com.jimueshop.admin.service.OrderItemService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.Page;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description ���ݶ�����ģ����ѯ����
 * 				�ͻ��˷����������Ϊ��
 * 				queryParams   "������1������ֵ1��������2������ֵ2������"
 *
 * @author hello world
 *
 * @modifyTime 2015��10��2��
 */
public class QuerySomeOrderItemAction extends ActionSupport {
	
	private Map<String,String> queryParams ;
	
	private Integer currentPage ;
	
	private OrderItemService orderItemService ;
	
	private Page page ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;
	
	@Override
	public String execute() throws Exception {
		
			page = orderItemService.querySomeOrderItemByProperties(currentPage, queryParams ) ;
			
			result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
	}

	public Page getPage() {
		return page;
	}

	public String getResult() {
		return result;
	}

	public void setQueryParams(Map<String, String> queryParams) {
		this.queryParams = queryParams;
	}

	public void setOrderItemService(OrderItemService orderItemService) {
		this.orderItemService = orderItemService;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	
}
