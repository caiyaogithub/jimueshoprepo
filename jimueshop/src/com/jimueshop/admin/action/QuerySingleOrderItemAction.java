package com.jimueshop.admin.action;

import com.jimueshop.admin.service.OrderItemService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.OrderItem;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description ��ѯ��������
 *
 * @author hello world
 *
 * @modifyTime 2015��10��1��
 */
public class QuerySingleOrderItemAction extends ActionSupport {
	
	private OrderItemService orderItemService ;
	
	private OrderItem orderItem ;
	
	private Integer id ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;
	
	@Override
	public String execute() throws Exception {
		
		orderItem = orderItemService.queryOrderItemById(id) ;
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
		
	}
	public OrderItem getOrderItem() {
		return orderItem;
	}
	public String getResult() {
		return result;
	}
	public void setOrderItemService(OrderItemService orderItemService) {
		this.orderItemService = orderItemService;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
