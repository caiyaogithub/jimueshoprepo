package com.jimueshop.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @description 数据库实体类，对应于数据库TAB_ATTR表，存储商品属性相关信息例如在手机小类下有属性  显示屏   操作系统 。。。
 *
 * @author hello world
 *
 * @modifyTime 2015年9月28日
 */
public class Attr {
	private Integer id ;
	private String attrName ;
	private SubType subType ;
	private String attrDesc ;
	private Set<AttrItem> attrItems = new HashSet<AttrItem>() ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAttrName() {
		return attrName;
	}
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}
	public SubType getSubType() {
		return subType;
	}
	public void setSubType(SubType subType) {
		this.subType = subType;
	}
	public String getAttrDesc() {
		return attrDesc;
	}
	public void setAttrDesc(String attrDesc) {
		this.attrDesc = attrDesc;
	}
	public Set<AttrItem> getAttrItems() {
		return attrItems;
	}
	public void setAttrItems(Set<AttrItem> attrItems) {
		this.attrItems = attrItems;
	}
}
