package com.jimueshop.domain;

import java.util.Date;

import org.apache.struts2.json.annotations.JSON;

/**
 * 
 * @description ��Ӧ�����ݿ�TAB_AD���洢�����Ϣ
 *
 * @author hello world
 *
 * @modifyTime 2015��9��28��
 */
public class Ad {
	private Integer id ;
	private SubType subType ;
	private Product product ;
	private String adDesc ;
	private Date beginTime ;
	private Date endTime ;
	private String picturePath ;
	private String flag ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public SubType getSubType() {
		return subType;
	}
	public void setSubType(SubType subType) {
		this.subType = subType;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getAdDesc() {
		return adDesc;
	}
	public void setAdDesc(String adDesc) {
		this.adDesc = adDesc;
	}
	@JSON(format="yyyy-MM-dd")
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	@JSON(format="yyyy-MM-dd")
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getPicturePath() {
		return picturePath;
	}
	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
}
