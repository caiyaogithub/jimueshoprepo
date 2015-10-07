package com.jimueshop.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @description ���ݿ�ʵ���࣬��Ӧ�����ݿ�TAB_ATTR���洢��Ʒ���������Ϣ�������ֻ�С����������  ��ʾ��   ����ϵͳ ������
 *
 * @author hello world
 *
 * @modifyTime 2015��9��28��
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
