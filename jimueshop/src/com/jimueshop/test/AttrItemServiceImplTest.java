package com.jimueshop.test;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jimueshop.admin.service.AttrItemService;

public class AttrItemServiceImplTest {

	@Test
	public void testQueryAllAttrItemByPage() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteAttrItemById() {
		fail("Not yet implemented");
	}

	@Test
	public void testQueryAttrItemById() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteManyAttrItemByIds() {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/applicationContext-*.xml") ;
		
		AttrItemService attrItemService = (AttrItemService)ac.getBean("AttrItemService") ;
		
		attrItemService.deleteManyAttrItemByIds(new ArrayList<Integer>(Arrays.asList(13,14))) ;
	}

	@Test
	public void testQuerySomeAttrItemByProperties() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddAttrItem() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateAttrItem() {
		fail("Not yet implemented");
	}

	@Test
	public void testQueryAttrItemByAttrId() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAttrItemDao() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAttrDao() {
		fail("Not yet implemented");
	}

}
