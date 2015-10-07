package com.jimueshop.admin.action;

import java.util.List;

import com.jimueshop.admin.service.OrderItemService;
import com.jimueshop.common.ActionResultInfo;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @description 改变订单状态
 * 				客户端发送请求包括：
 * 				String idList : 1,2,3
 * 				String status : 已发货 已完成 两种状态其中的一个 
 * 				
 *
 * @author hello world
 *
 * @modifyTime 2015年10月4日
 * 
 */
public class ChangeOrderItemStatusAction extends ActionSupport {
	
	private List<Integer> idList ;
	
	private String status ;
	
	private OrderItemService orderItemService ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;

	@Override
	public String execute() throws Exception {
		
		if(!orderItemService.checkOrderItemStatus(idList , status.trim().equals("已发货") ? "已付款" : "已发货" )){
			
			result = ActionResultInfo.ORDER_STATUS_ERROR ;
			
			return ERROR ;
			
		}else{
			
			orderItemService.changeOrderItemSatus(idList , status.trim()) ;
			
			result = ActionResultInfo.SUCCESS ;
			
			return SUCCESS ;
			
		}
	}
	
	public String getResult() {
		return result;
	}

	public void setIdList(List<Integer> idList) {
		this.idList = idList;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setOrderItemService(OrderItemService orderItemService) {
		this.orderItemService = orderItemService;
	}
}
