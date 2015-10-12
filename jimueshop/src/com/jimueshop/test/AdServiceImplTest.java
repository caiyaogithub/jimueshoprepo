package com.jimueshop.test;

import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jimueshop.admin.service.AdService;
import com.jimueshop.domain.Ad;
import com.jimueshop.domain.Product;
import com.jimueshop.domain.SubType;

public class AdServiceImplTest {

	ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/applicationContext-*.xml") ;
	
	AdService adService = (AdService)ac.getBean("AdService") ;
	
	@Test
	public void testQueryAllAdByPage() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteAdById() {
		fail("Not yet implemented");
	}

	@Test
	public void testQueryAdById() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteManyAdByIds() {
		fail("Not yet implemented");
	}

	@Test
	public void testQuerySomeAdByProperties() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddAd() throws ParseException {
		Ad ad = new Ad() ; 
		ad.setAdDesc("这个一个广告描述") ;
		ad.setBeginTime(new SimpleDateFormat("yyyy-MM-ddd").parse("2012-03-21")) ;
		ad.setEndTime(new SimpleDateFormat("yyyy-MM-ddd").parse("2013-03-21")) ;
		ad.setFlag("已结束") ;
		Product product = new Product() ;
		product.setId(50) ;
		SubType subType = new SubType() ;
		subType.setId(20) ;
		ad.setProduct(product) ;
		ad.setSubType(subType) ;
		adService.addAd(ad) ;
	}

	@Test
	public void testUpdateAd() {
		
	}

	@Test
	public void testQueryAdBySubTypeId() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAdDao() {
		fail("Not yet implemented");
	}

}
