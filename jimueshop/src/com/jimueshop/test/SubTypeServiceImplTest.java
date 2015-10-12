package com.jimueshop.test;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jimueshop.admin.service.SubTypeService;
import com.jimueshop.admin.service.SuperTypeService;
import com.jimueshop.domain.SubType;
import com.jimueshop.domain.SuperType;

public class SubTypeServiceImplTest {
	ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/applicationContext-*.xml") ;
	
	SubTypeService subTypeService = (SubTypeService)ac.getBean("SubTypeService") ;
	SuperTypeService superTypeService = (SuperTypeService)ac.getBean("SuperTypeService") ;
	@Test
	public void testQueryAllSubTypeByPage() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteSubTypeById() {
		fail("Not yet implemented");
	}

	@Test
	public void testQuerySubTypeById() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteManySubTypeByIds() {
		fail("Not yet implemented");
	}

	@Test
	public void testQuerySomeSubTypeByProperties() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddSubType() {
		/*for(int i = 0 ; i < 10 ; i ++){
			SuperType superType = superTypeService.querySuperTypeById(i+1 ) ;
			SubType subType = new SubType() ;
			subType.setSuperType(superType) ; 
			subType.setSubTypeName("小类" + i ) ;
			subTypeService.addSubType(subType) ;
		}*/
		SuperType superType = superTypeService.querySuperTypeById(1) ;
		SubType subType = new SubType() ;
		subType.setSuperType(superType) ; 
		subType.setSubTypeName("小类2") ;
		subTypeService.addSubType(subType) ;
	}

	@Test
	public void testUpdateSubType() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckSubTypeNameExist() {
		fail("Not yet implemented");
	}

	@Test
	public void testQuerySubTypeBySuperTypeId() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSubTypeDao() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSuperTypeDao() {
		fail("Not yet implemented");
	}

}
