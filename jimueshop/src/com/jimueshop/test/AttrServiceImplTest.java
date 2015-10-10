package com.jimueshop.test;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jimueshop.admin.service.AttrService;
import com.jimueshop.admin.service.SubTypeService;
import com.jimueshop.domain.Attr;
import com.jimueshop.domain.SubType;

public class AttrServiceImplTest {
	
	ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/applicationContext-*.xml") ;
	
	AttrService attrService = (AttrService)ac.getBean("AttrService") ;
	
	SubTypeService subTypeService = (SubTypeService)ac.getBean("SubTypeService") ;
	@Test
	public void testQueryAllAttrByPage() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteAttrById() {
		fail("Not yet implemented");
	}

	@Test
	public void testQueryAttrById() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteManyAttrByIds() {
		fail("Not yet implemented");
	}

	@Test
	public void testQuerySomeAttrByProperties() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddAttr() {
		for(int i = 0 ; i< 10 ; i ++ ){
			SubType subType = subTypeService.querySubTypeById(i + 11 ) ;
			Attr attr = new Attr() ;
			attr.setAttrName("小类" + (i + 11) + "下的属性" + i ) ;
			attr.setAttrDesc("小类" + i + "的描述") ;
			attr.setSubType(subType) ;
			attrService.addAttr(attr) ;
		}
	}

	@Test
	public void testUpdateAttr() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckAttrNameExist() {
		fail("Not yet implemented");
	}

	@Test
	public void testQueryAttrBySubTypeId() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAttrDao() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSubTypeDao() {
		fail("Not yet implemented");
	}

}
