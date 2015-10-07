package com.jimueshop.test;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jimueshop.admin.service.AttrService;

public class TestSpring {
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/applicationContext-*.xml") ;
		
		AttrService attrService = (AttrService)ac.getBean("AttrService") ;
/*		
		Attr attr = new Attr() ;
		attr.setAttrDesc("这是手机小类下的操作系统属性") ;
		attr.setAttrName("操作系统") ;
		attr.setId(3) ;
		attrService.updateAttr(attr) ;*/
		
		/*SubTypeService subTypeService = (SubTypeService)ac.getBean("SubTypeService") ;
		
		SubType subType = new SubType() ;
		subType.setSubTypeName("手机修改") ;
		subType.setId(2) ;
		subTypeService.updateSubType(subType) ;*/
		attrService.deleteManyAttrByIds(new ArrayList<Integer>(Arrays.asList(3,6))) ;
	}
}
