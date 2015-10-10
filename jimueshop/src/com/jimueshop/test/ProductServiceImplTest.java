package com.jimueshop.test;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jimueshop.admin.service.AttrItemService;
import com.jimueshop.admin.service.ProductService;
import com.jimueshop.admin.service.SubTypeService;
import com.jimueshop.admin.service.SuperTypeService;
import com.jimueshop.domain.AttrItem;
import com.jimueshop.domain.Page;
import com.jimueshop.domain.Product;
import com.jimueshop.domain.SubType;
import com.jimueshop.domain.SuperType;

public class ProductServiceImplTest {
	ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/applicationContext-*.xml") ;
	
	ProductService productService = (ProductService)ac.getBean("ProductService") ;
	SuperTypeService SuperTypeService = (SuperTypeService)ac.getBean("SuperTypeService") ;
	SubTypeService SubTypeService = (SubTypeService)ac.getBean("SubTypeService") ;
	AttrItemService AttrItemService = (AttrItemService)ac.getBean("AttrItemService") ;
	@Test
	public void testQueryAllProductByPage() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteProductById() {
		fail("Not yet implemented");
	}

	@Test
	public void testQueryProductById() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteManyProductByIds() {
		List<Integer> ids = new ArrayList<Integer>() ;
		ids.add(11) ;
		productService.deleteManyProductByIds(ids) ;
	}

	@Test
	public void testQuerySomeProductByProperties() {
		fail("Not yet implemented");
	}
	public int generatorRandomInt(int min , int max ){
		
		 Random random = new Random() ;

	    int s = random.nextInt(max)%(max-min+1) + min ;
	    
	    return s ;
	}
	@Test
	public void testAddProduct() {
		Random random = new Random() ;
		/*for(int i = 0 ; i < 10 ; i ++){
			SuperType superType = SuperTypeService.querySuperTypeById(i + 16 ) ;
			SubType subType = SubTypeService.querySubTypeById(26 + i ) ;
			Set<AttrItem> attrItems = new HashSet<AttrItem>() ;
			AttrItem attrItem1 = AttrItemService.queryAttrItemById(generatorRandomInt(46,55)) ;
			AttrItem attrItem2 = AttrItemService.queryAttrItemById(generatorRandomInt(46,55)) ;
			attrItems.add(attrItem1) ;
			attrItems.add(attrItem2) ;
			
			Product product = new Product() ;
			product.setBrand("品牌" + i ) ;
			product.setInTime(new Date());
			product.setIntroduce("这是产品描述" + i ) ;
			product.setIsHost(true) ;
			product.setIsNew(true) ;
			product.setIsSale(true) ;
			product.setIsSpecial(true) ;
			product.setNowPrice(i) ;
			product.setPicturePath("") ;
			product.setPrice(i) ;
			product.setProductName("这是产品名" + i ) ;
			product.setProductNum(10) ;
			product.setSubType(subType) ;
			product.setSuperType(superType) ;
			product.setAttrItems(attrItems) ;
			productService.addProduct(product) ;
			
		}*/
		
		SuperType superType = new SuperType() ;
		superType.setId(1) ;
		SubType subType = new SubType() ;
		subType.setId(2) ;
		Set<AttrItem> attrItems = new HashSet<AttrItem>() ;
		AttrItem attrItem1 = new AttrItem() ;
		attrItem1.setId(46) ;
		AttrItem attrItem2 = new AttrItem() ;
		attrItem2.setId(47) ;
		attrItems.add(attrItem1) ;
		attrItems.add(attrItem2) ;
		
		Product product = new Product() ;
		product.setBrand("测试" ) ;
		product.setInTime(new Date());
		product.setIntroduce("测试") ;
		product.setIsHost(true) ;
		product.setIsNew(true) ;
		product.setIsSale(true) ;
		product.setIsSpecial(true) ;
		product.setNowPrice(1) ;
		product.setPicturePath("") ;
		product.setPrice(1) ;
		product.setProductName("测试") ;
		product.setProductNum(10) ;
		product.setSubType(subType) ;
		product.setSuperType(superType) ;
		product.setAttrItems(attrItems) ;
		productService.addProduct(product) ;
	}

	@Test
	public void testUpdateProduct() {
		SuperType superType = new SuperType() ;
		superType.setId(1) ;
		SubType subType = new SubType() ;
		subType.setId(2);
		Set<AttrItem> attrItems = new HashSet<AttrItem>() ;
		AttrItem attrItem = new AttrItem() ;
		attrItem.setId(9) ;
		
		AttrItem attrItem1 = new AttrItem() ;
		attrItem1.setId(10) ;
		
		attrItems.add(attrItem1) ;
		attrItems.add(attrItem) ;
		
		Product product = new Product() ;
		product.setId(11) ;
		product.setBrand("黑莓") ;
		product.setInTime(new Date());
		product.setIntroduce("全新的BB10系统") ;
		product.setIsHost(true) ;
		product.setIsNew(true) ;
		product.setIsSale(true) ;
		product.setIsSpecial(true) ;
		product.setNowPrice(1500) ;
		product.setPicturePath("") ;
		product.setPrice(1000) ;
		product.setProductName("黑莓z10") ;
		product.setProductNum(10) ;
		product.setSubType(subType) ;
		product.setSuperType(superType) ;
		product.setAttrItems(attrItems) ;
		productService.updateProduct(product) ;
	}

	@Test
	public void testCheckProductNameExist() {
		fail("Not yet implemented");
	}

	@Test
	public void testQueryProductBySubTypeId() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetProductDao() {
		fail("Not yet implemented");
	}
	@Test
	public void testQueryProductByAttrItem(){
		Map<String , String> extraParams = new HashMap<String, String>() ;
		extraParams.put("price", "0-6") ;
		Page page = productService.queryProductByAttrItem(1, new ArrayList<Integer>(Arrays.asList(50)),extraParams ) ;
		
		for(Object o : page.getList()){
			Product p = (Product)o ;
			System.out.println(p.getProductName()) ;
		}
	}
}
