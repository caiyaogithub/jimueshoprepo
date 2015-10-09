package com.jimueshop.test;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jimueshop.admin.service.SuperTypeService;
import com.jimueshop.domain.SuperType;
	
public class SuperTypeServiceImplTest {
	ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/applicationContext-*.xml") ;
	
	SuperTypeService superTypeService = (SuperTypeService)ac.getBean("SuperTypeService") ;
	@Test
	public void testQueryAllSuperTypeByPage() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteSuperTypeById() {
		fail("Not yet implemented");
	}

	@Test
	public void testQuerySuperTypeById() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteManySuperTypeByIds() {
		fail("Not yet implemented");
	}

	@Test
	public void testQuerySomeSuperTypeByProperties() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddSuperType() {
		for(int i = 0 ; i < 10 ; i++ ){
			SuperType superType = new SuperType() ;
			superType.setTypeName("´óÀà" + i) ;
			superTypeService.addSuperType(superType) ;
		}
	}

	@Test
	public void testUpdateSuperType() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckSuperTypeNameExist() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSuperTypeDao() {
		fail("Not yet implemented");
	}

}
