package com.jimueshop.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @description 
 *              数据库实体类，对应于数据库TAB_ATTR_ITEM表，存储某属性下的属性值项，例如在手机小类下有一个属性（对应于Attr类）为显示屏
 *              ，则该类存储的是显示屏的尺寸
 *
 * @author hello world
 *
 * @modifyTime 2015年10月7日
 */
public class AttrItem {
	private Integer id ;
	private Attr attr ;
	private String value ;
	private Set<Product> products = new HashSet<Product>() ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Attr getAttr() {
		return attr;
	}
	public void setAttr(Attr attr) {
		this.attr = attr;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
}

