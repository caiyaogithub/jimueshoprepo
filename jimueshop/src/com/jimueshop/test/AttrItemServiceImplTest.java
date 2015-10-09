package com.jimueshop.test;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jimueshop.admin.service.AttrItemService;
import com.jimueshop.admin.service.AttrService;
import com.jimueshop.domain.Attr;
import com.jimueshop.domain.AttrItem;

public class AttrItemServiceImplTest {
	
	ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/applicationContext-*.xml") ;
	
	AttrItemService attrItemService = (AttrItemService)ac.getBean("AttrItemService") ;
	
	AttrService attrService = (AttrService)ac.getBean("AttrService") ;
	
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
		
		attrItemService.deleteManyAttrItemByIds(new ArrayList<Integer>(Arrays.asList(13,14))) ;
	}

	@Test
	public void testQuerySomeAttrItemByProperties() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddAttrItem() {
			for(int i = 0 ; i < 10 ; i ++){
				Attr attr = attrService.queryAttrById(36 + i ) ;
				AttrItem attrItem = new AttrItem() ;
				attrItem.setAttr(attr) ; 
				attrItem.setValue("属性" + (i + 36 ) + "下的属性项" + i ) ;
				attrItemService.addAttrItem(attrItem) ;
			}
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
