package com.jimueshop.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jimueshop.domain.SuperType;

public class HibernateTest {
	public static void main(String[] args) {
		Configuration config = new Configuration().configure() ;
		SessionFactory sessionFactory = config.buildSessionFactory() ;
		Session session = sessionFactory.getCurrentSession() ;
		session.beginTransaction() ;
		
		/*SuperType superType = (SuperType)session.get(SuperType.class, 17 ) ;*/

		SuperType superType = new SuperType() ;
		superType.setId(1) ;
		superType.setTypeName("µç×ÓÊé") ;
		session.saveOrUpdate(superType) ;
		/*List<SubType> subTypes = superType.getSubTypes() ;
		
		for(SubType s : subTypes ){
			
			System.out.println(s.getSubtypeName()) ;
			
		}*/
		//System.out.println(order.getOrderItems().size());
		session.getTransaction().commit() ; 
	}
}
