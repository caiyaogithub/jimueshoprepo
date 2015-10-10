package com.jimueshop.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jimueshop.domain.Attr;
import com.jimueshop.domain.AttrItem;
import com.jimueshop.domain.Order;
import com.jimueshop.domain.OrderItem;
import com.jimueshop.domain.SubType;
import com.jimueshop.domain.SuperType;
import com.jimueshop.domain.User;

public class CreateData {
	public static void main(String[] args) throws Exception {
		//createOrderItem() ;
		//createUser() ;
		//createSuperType() ;
		//createAttr() ;
	}
	public static void createAttr() throws Exception {

		
		SuperType superType = new SuperType() ;
		superType.setTypeName("����") ;
		
		SubType subType1 = new SubType() ;
		subType1.setSubTypeName("�ֻ�") ;
		
		Attr attr1 = new Attr() ;
		attr1.setAttrName("��ʾ��") ;
		
		Attr attr2 = new Attr() ;
		attr2.setAttrName("����ϵͳ") ;
		
		AttrItem attrItem = new AttrItem() ;
		attrItem.setValue("21��") ;
		AttrItem attrItem1 = new AttrItem() ;
		attrItem1.setValue("20��") ;
		
		attr1.getAttrItems().add(attrItem) ;
		attr1.getAttrItems().add(attrItem1) ;
		

		AttrItem attrItem2 = new AttrItem() ;
		attrItem2.setValue("andorid") ;
		AttrItem attrItem3 = new AttrItem() ;
		attrItem3.setValue("ios") ;
		attr2.getAttrItems().add(attrItem2) ;
		attr2.getAttrItems().add(attrItem3) ;
		
		subType1.getAttrs().add(attr2) ;
		subType1.getAttrs().add(attr1) ;
		
		superType.getSubTypes().add(subType1) ;
		
		Configuration config = new Configuration().configure() ;
		SessionFactory sessionFactory = config.buildSessionFactory() ;
		Session session = sessionFactory.getCurrentSession() ;
		session.beginTransaction();
		
		session.save(superType) ;
		
		session.getTransaction().commit() ; 
		
	}
	public static void createUser() throws ParseException{
		Configuration config = new Configuration().configure() ;
		SessionFactory sessionFactory = config.buildSessionFactory() ;
		Session session = sessionFactory.getCurrentSession() ;
		session.beginTransaction();
		
		
		
		/*for(int i = 0 ; i < 10 ; i ++){
			User user = new User(
					String userName, String password, String email,
					String trueName, String gender, Date birthday, String address,
					String postCode, String phone, String mobile, int score,
					String status
					String.valueOf(i) ,
					String.valueOf(i) ,
					String.valueOf(i) ,
					String.valueOf(i) ,
					String.valueOf(i) ,
					new SimpleDateFormat("yyyy-MM-dd").parse("2015-01-" + i ) ,
					String.valueOf(i) , 
					String.valueOf(i) ,
					String.valueOf(i) ,
					String.valueOf(i) ,
					i ,
					"����"
			) ;
			session.save(user) ;
			session.flush() ; 
		}*/
		
		User user = new User(
			/*	String userName, String password, String email,
				String trueName, String gender, Date birthday, String address,
				String postCode, String phone, String mobile, int score,
				String status*/
				String.valueOf("����") ,
				String.valueOf(1) ,
				String.valueOf(1) ,
				String.valueOf("����") ,
				String.valueOf("��") ,
				new SimpleDateFormat("yyyy-MM-dd").parse("2015-01-" + 1 ) ,
				String.valueOf("����֣��") , 
				String.valueOf(1) ,
				String.valueOf(1) ,
				String.valueOf(1) ,
				1 ,
				"����"
		) ;
		
		session.save(user) ;
		
		
		
		session.getTransaction().commit(); 
		
		
		
	}
	public static void createOrderItem(){
		/*String userName, String realName, String address,
		String postcode, String phone, Date orderDate, String flag,
		Set<OrderItem> orderItems*/
		Order order = new Order(
					"����" ,
					"��ʵ������" ,
					"henna" ,
					"1234" ,
					"1234456" ,
					new Date()
				) ;
		
		User user = new User() ;
		user.setTrueName("caiyao") ;
		user.setUserName("��ҫ") ;
		
		
		/*Order order, Product product, String productName,
		double price, int productNum, User user*/
		OrderItem orderItem = new OrderItem() ; 
		orderItem.setPrice(100) ;
		orderItem.setProductName("�ֻ�") ;
		orderItem.setFlag("�ѷ���") ;
		orderItem.setOrder(order) ;
		orderItem.setUser(user) ;
		
		OrderItem orderItem1 = new OrderItem() ; 
		orderItem1.setPrice(100) ;
		orderItem1.setFlag("�ѷ���") ;
		orderItem1.setProductName("����") ;
		orderItem1.setOrder(order) ;
		orderItem1.setUser(user) ;
		
		OrderItem orderItem2 = new OrderItem() ; 
		orderItem2.setFlag("�����") ;
		orderItem2.setPrice(100) ;
		orderItem2.setProductName("ϴ�»�") ;
		orderItem2.setOrder(order) ;
		orderItem2.setUser(user) ;
		
		
		
		Configuration config = new Configuration().configure() ;
		SessionFactory sessionFactory = config.buildSessionFactory() ;
		Session session = sessionFactory.getCurrentSession() ;
		session.beginTransaction();
		
		session.save(orderItem) ;
		session.save(orderItem1) ;
		session.save(orderItem2) ;
		
		session.getTransaction().commit(); 
	}
	public static void createSuperType(){
		
		
		Configuration config = new Configuration().configure() ;
		SessionFactory sessionFactory = config.buildSessionFactory() ;
		Session session = sessionFactory.getCurrentSession() ;
		session.beginTransaction();
		
		SuperType superType = new SuperType() ; 
		superType.setTypeName("����") ;
		
		session.save(superType) ;
		
		SubType subType = new SubType() ;
		subType.setSubTypeName("С��1") ;
		subType.setSuperType(superType);
		
		SubType subType1 = new SubType() ;
		subType1.setSubTypeName("С��2") ;
		subType1.setSuperType(superType);
		
		SubType subType2 = new SubType() ;
		subType2.setSubTypeName("С��3") ;
		subType2.setSuperType(superType);
			
		List<SubType> subTypes = new ArrayList<SubType>() ;
		
		subTypes.add(subType2) ;
		subTypes.add(subType1) ;
		subTypes.add(subType) ;
		
		superType.setSubTypes(subTypes) ;
		
		session.save(subType) ;
		session.save(subType1) ;
		session.save(subType2) ;
		
		session.getTransaction().commit(); 
	}
}
