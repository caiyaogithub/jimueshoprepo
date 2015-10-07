package com.jimueshop.admin.action;

import java.util.Map;

import com.jimueshop.admin.service.OrderItemService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.Page;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description 根据多属性模糊查询订单
 * 				客户端发送请求参数为：
 * 				queryParams   "参数名1：参数值1，参数名2：参数值2。。。"
 *
 * @author hello world
 *
 * @modifyTime 2015年10月2日
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
