package com.jimueshop.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @description ���ݿ�ʵ���࣬��Ӧ�����ݿ�TAB_SUBTYPE���洢��ƷС����Ϣ
 *
 * @author hello world
 *
 * @modifyTime 2015��9��28��
 */
public class SubType {
	private Integer id ;
	private SuperType superType ;
	private String subTypeName ;
	private Set<Attr> attrs = new HashSet<Attr>() ;
	private Set<Product> products = new HashSet<Product>() ;
	private Set<Ad> ads = new HashSet<Ad>() ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public SuperType getSuperType() {
		return superType;
	}
	public void setSuperType(SuperType superType) {
		this.superType = superType;
	}
	public String getSubTypeName() {
		return subTypeName;
	}
	public void setSubTypeName(String subTypeName) {
		this.subTypeName = subTypeName;
	}
	public Set<Attr> getAttrs() {
		return attrs;
	}
	public void setAttrs(Set<Attr> attrs) {
		this.attrs = attrs;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	public Set<Ad> getAds() {
		return ads;
	}
	public void setAds(Set<Ad> ads) {
		this.ads = ads;
	}
}
