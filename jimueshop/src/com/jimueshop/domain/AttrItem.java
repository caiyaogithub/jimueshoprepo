package com.jimueshop.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @description 
 *              ���ݿ�ʵ���࣬��Ӧ�����ݿ�TAB_ATTR_ITEM���洢ĳ�����µ�����ֵ��������ֻ�С������һ�����ԣ���Ӧ��Attr�ࣩΪ��ʾ��
 *              �������洢������ʾ���ĳߴ�
 *
 * @author hello world
 *
 * @modifyTime 2015��10��7��
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

