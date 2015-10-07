package com.jimueshop.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jimueshop.admin.service.OrderItemService;
import com.jimueshop.domain.OrderItem;
import com.jimueshop.domain.Page;

public class TestSpringOrder {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext-*.xml") ;
		OrderItemService orderService = (OrderItemService)ac.getBean("orderItemService") ;
		/*Page orders = orderService.findAllOrderByPage(1) ;
		System.out.println("共有 " + orders.getList().size() + " 条数据") ;*/
		//orderService.deleteOrderItemById(20) ;
		Map<String,String> params = new HashMap<String,String>() ;
		params.put("flag", "已发货") ;
		Page orders = (Page)orderService.querySomeOrderItemByProperties(1, params) ;
		System.out.println(orders.getList().size()) ;
		System.out.println(((OrderItem)orders.getList().get(0)).getFlag());
	}
}
