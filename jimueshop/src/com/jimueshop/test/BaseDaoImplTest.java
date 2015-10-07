package com.jimueshop.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.BaseDaoImpl;

import com.jimueshop.domain.Page;
import com.jimueshop.domain.User;

public class BaseDaoImplTest {
	@Test
	public void deleteByPropertyTest(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/applicationContext-*.xml") ;
		BaseDaoImpl<User> test = (BaseDaoImpl<User>)ac.getBean("userDao") ;
		Map<String,String> params = new HashMap<String,String>() ;
		/*params.put("userName", "张三") ;
		params.put("gender", "男") ;*/
		params.put("score", "1") ;
		Page page = test.findByProperties(1 , params ) ;
		System.out.println("查询结果行数： " + page.getList().size() );
	}
}
