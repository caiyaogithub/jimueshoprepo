package com.jimueshop.domain;
/**
 * 
 * @description ʵ���࣬��Ӧ�����ݿ�TAB_ADMIN���洢����Ա��Ϣ
 *
 * @author hello world
 *
 * @modifyTime 2015��9��28��
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
