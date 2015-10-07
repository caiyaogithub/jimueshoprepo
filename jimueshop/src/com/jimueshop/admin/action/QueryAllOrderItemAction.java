package com.jimueshop.admin.action;

import com.jimueshop.admin.service.OrderItemService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.Page;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @description 查询所有订单信息
 *
 * @author hello world
 *
 * @modifyTime 2015年10月1日
 */
public class QueryAllOrderItemAction extends ActionSupport {
	
	private OrderItemService orderItemService ;
	
	private Integer currentPage ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;
	
	private Page page ;
	
	@Override
	public String execute() throws Exception {
		
		page = orderItemService.queryAllOrderItemByPage(currentPage) ;
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
	}

	public void setOrderItemService(OrderItemService orderItemService) {
		this.orderItemService = orderItemService;
	}

	public String getResult() {
		return result;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Page getPage() {
		return page;
	}
}
