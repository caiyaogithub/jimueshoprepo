package com.jimueshop.admin.service;

import java.util.List;
import java.util.Map;

import com.jimueshop.domain.OrderItem;
import com.jimueshop.domain.Page;

public interface OrderItemService {
	/**
	 * 获取指定页的所有订单信息
	 * @param currentPage 页数
	 * @return Page对象
	 */
	public Page queryAllOrderItemByPage(int currentPage ) ;
	/**
	 * 根据订单ID删除订单
	 * @param orderItemId
	 */
	public void deleteOrderItemById(int orderItemId ) ;
	/**
	 * 通过订单ID查询订单 
	 * @param orderItemId
	 * @return
	 */
	public OrderItem queryOrderItemById(int orderItemId ) ;
	/**
	 * 根据ID列表批量删除订单
	 * @param ids
	 */
	public void deleteManyOrderItemByIds(List<Integer> ids ) ;
	/**
	 * 通过多属性模糊查询订单
	 * @param params 属性名--值映射
	 * @param currentPage 
	 * @return
	 */
	public Page querySomeOrderItemByProperties(int currentPage , Map<String , String > params ) ;
	/**
	 * 查看idList中的订单状态是不是status
	 * @param idList 订单id列表
	 * @param status 订单状态 已发货 已完成 两种状态其中的一个 
	 * @return
	 */
	public boolean checkOrderItemStatus(List<Integer> idList , String status ) ;
	/**
	 * 改变订单状态
	 * @param idList 订单列表
	 * @param status 订单状态
	 */
	public void changeOrderItemSatus(List<Integer> idList , String status ) ;
}
