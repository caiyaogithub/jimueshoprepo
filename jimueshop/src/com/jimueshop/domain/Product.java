package com.jimueshop.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @description 实体类，对应于数据库TAB_PRODUCT表，存储商品信息
 *
 * @author hello world
 *
 * @modifyTime 2015年9月28日
 */
public class Product {
	private Integer id ;
	private SuperType superType ;
	private SubType subType ;
	private String brand ;
	private String productName ;
	private String introduce ;
	private double price ;
	private double nowPrice ;
	private String picturePath ;
	private Date inTime ;
	private boolean isNew ;
	private boolean isSale ;
	private boolean isHost ;
	private boolean isSpecial ;
	private int productNum ;
	private Ad ad ;
	private Set<Comment> comments = new HashSet<Comment>() ;
	private Set<AttrItem> attrItems = new HashSet<AttrItem>() ;
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
	public SubType getSubType() {
		return subType;
	}
	public void setSubType(SubType subType) {
		this.subType = subType;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getNowPrice() {
		return nowPrice;
	}
	public void setNowPrice(double nowPrice) {
		this.nowPrice = nowPrice;
	}
	public String getPicturePath() {
		return picturePath;
	}
	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}
	public Date getInTime() {
		return inTime;
	}
	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}
	public boolean getIsNew() {
		return isNew;
	}
	public void setIsNew(boolean isNew) {
		this.isNew = isNew;
	}
	public boolean getIsSale() {
		return isSale;
	}
	public void setIsSale(boolean isSale) {
		this.isSale = isSale;
	}
	public boolean getIsHost() {
		return isHost;
	}
	public void setIsHost(boolean isHost) {
		this.isHost = isHost;
	}
	public boolean getIsSpecial() {
		return isSpecial;
	}
	public void setIsSpecial(boolean isSpecial) {
		this.isSpecial = isSpecial;
	}
	public int getProductNum() {
		return productNum;
	}
	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}
	public Ad getAd() {
		return ad;
	}
	public void setAd(Ad ad) {
		this.ad = ad;
	}
	public Set<Comment> getComments() {
		return comments;
	}
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
	public Set<AttrItem> getAttrItems() {
		return attrItems;
	}
	public void setAttrItems(Set<AttrItem> attrItems) {
		this.attrItems = attrItems;
	}
}
