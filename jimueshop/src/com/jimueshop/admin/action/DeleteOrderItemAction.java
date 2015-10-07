package com.jimueshop.admin.action;

import java.util.List;

import com.jimueshop.admin.service.OrderItemService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.OrderItem;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description 删除订单
 *
 * @author hello world
 *
 * @modifyTime 2015年10月1日
 */
public class DeleteOrderItemAction extends ActionSupport {
	
	private OrderItemService orderItemService ;
	
	private List<Integer> idList  ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;
	
	
	@Override
	public String execute() throws Exception {
		
			orderItemService.deleteManyOrderItemByIds(idList) ;
			
			result = ActionResultInfo.SUCCESS ;
			
		return SUCCESS ;		
	}
	
	public String getResult() {
		return result;
	}
	public void setOrderItemService(OrderItemService orderItemService) {
		this.orderItemService = orderItemService;
	}

	public void setIdList(List<Integer> idList) {
		this.idList = idList;
	}
}
