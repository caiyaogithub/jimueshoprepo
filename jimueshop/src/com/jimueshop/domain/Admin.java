package com.jimueshop.domain;
/**
 * 
 * @description 实体类，对应于数据库TAB_ADMIN表，存储管理员信息
 *
 * @author hello world
 *
 * @modifyTime 2015年9月28日
 */
public class Admin {
	private Integer id ;
	private String name ;
	private String password ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", password=" + password
				+ "]";
	}
}
