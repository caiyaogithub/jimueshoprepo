package com.jimueshop.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.apache.struts2.json.annotations.JSON;
import org.apache.struts2.json.annotations.JSONFieldBridge;

/**
 * 
 * @description 数据库实体类，对应于数据库TAB_ORDER表，存储订单信息
 *
 * @author hello world
 *
 * @modifyTime 2015年9月28日
 */
public class Order {
	private Integer id ;
	private String userName ;
	private String realName ;
	private String address ;
	private String postcode ;
	private String phone ;
	private Date orderDate ; 
	private Set<OrderItem> orderItems = new HashSet<OrderItem>() ;
	
	
	public Order() {
	}


	public Order(String userName, String realName, String address,
			String postcode, String phone, Date orderDate) {
		super();
		this.userName = userName;
		this.realName = realName;
		this.address = address;
		this.postcode = postcode;
		this.phone = phone;
		this.orderDate = orderDate;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Set<OrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
}
