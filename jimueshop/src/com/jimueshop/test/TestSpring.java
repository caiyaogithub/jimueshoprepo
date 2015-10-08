package com.jimueshop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jimueshop.admin.service.AttrItemService;
import com.jimueshop.domain.AttrItem;
import com.jimueshop.domain.Page;

public class TestSpring {
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/applicationContext-*.xml") ;
		
		AttrItemService attrItemService = (AttrItemService)ac.getBean("AttrItemService") ;
		/*
		AttrItem attrItem = new AttrItem() ;
		
		Attr attr = new Attr() ;
		
		attr.setId(34) ;
		
		attrItem.setValue("BB10") ;
		
		attrItem.setAttr(attr) ;

		attrItemService.addAttrItem(attrItem) ;*/
		Page page = attrItemService.queryAttrItemByAttrId(1, 6) ;
		
		for(Object o : page.getList()){
			AttrItem attrItem = (AttrItem)o ;
			System.out.println(attrItem.getValue());
		}
	}
}
