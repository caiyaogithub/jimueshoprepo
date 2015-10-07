package com.jimueshop.admin.service.impl;

import java.util.List;
import java.util.Map;

import com.jimueshop.admin.dao.OrderItemDao;
import com.jimueshop.admin.service.OrderItemService;
import com.jimueshop.domain.OrderItem;
import com.jimueshop.domain.Page;

public class OrderItemServiceImpl implements OrderItemService {
	
	private OrderItemDao orderItemDao ;

	@Override
	public Page queryAllOrderItemByPage(int currentPage) {
		return orderItemDao.getPageReady(currentPage, "from OrderItem" ) ;
	}

	@Override
	public void deleteOrderItemById(int orderItemId) {
		OrderItem orderItem = queryOrderItemById(orderItemId) ;
		orderItemDao.delete(orderItem) ;
	}

	@Override
	public OrderItem queryOrderItemById(int orderItemId) {
		return orderItemDao.findById(orderItemId) ;
	}
	@Override
	public void deleteManyOrderItemByIds(List<Integer> ids) {
		orderItemDao.deleteByPropertyWithHQL("id", ids ) ;
	}
	@Override
	public Page querySomeOrderItemByProperties(int currentPage , Map<String, String> params) {
		return orderItemDao.findByProperties(currentPage, params) ;
	}
	@Override
	public boolean checkOrderItemStatus(List<Integer> idList, String status) {
		List<OrderItem> orderItems = orderItemDao.findByIds(idList) ;
		for(OrderItem orderItem : orderItems ){
			if(!orderItem.getFlag().trim().equals(status.trim())){
				return false ;
			}
		}
		return true ;
	}
	@Override
	public void changeOrderItemSatus(List<Integer> idList, String status) {
		
		orderItemDao.updateManyByProperty("id", idList , "flag" , status ) ;
		
	}
	
	
	public void setOrderItemDao(OrderItemDao orderItemDao) {
		this.orderItemDao = orderItemDao;
	}
	
	
}
