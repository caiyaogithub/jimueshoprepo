package com.jimueshop.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @description 实体类，对应于数据库TAB_USER表，存储普通用户信息
 *
 * @author hello world
 *
 * @modifyTime 2015年9月28日
 */
public class User {
	private Integer id ;
	private String userName ;
	private String password ;
	private String email ;
	private String trueName ;
	private String gender ;
	private Date birthday ;
	private String address ;
	private String postCode ;
	private String phone ;
	private String mobile ;
	private int score ;
	private String status ; // 用户账号状态
	private Set<OrderItem> orders = new HashSet<OrderItem>() ;
	
	public User() {
		
	}
	public User(String userName, String password, String email,
			String trueName, String gender, Date birthday, String address,
			String postCode, String phone, String mobile, int score,
			String status) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.trueName = trueName;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
		this.postCode = postCode;
		this.phone = phone;
		this.mobile = mobile;
		this.score = score;
		this.status = status;
	}
	public Set<OrderItem> getOrders() {
		return orders;
	}
	public void setOrders(Set<OrderItem> orders) {
		this.orders = orders;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTrueName() {
		return trueName;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
