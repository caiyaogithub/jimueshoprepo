package com.jimueshop.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * @description ���ݿ�ʵ���࣬��Ӧ�����ݿ�TAB_SUPERTYPE���洢��Ʒ����
 *
 * @author hello world
 *
 * @modifyTime 2015��9��28��
 */
public class SuperType {
	private Integer id ;
	private String typeName ;
	private List<SubType> subTypes = new ArrayList<SubType>() ;
	private Set<Product> products = new HashSet<Product>() ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public List<SubType> getSubTypes() {
		return subTypes;
	}
	public void setSubTypes(List<SubType> subTypes) {
		this.subTypes = subTypes;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
}
