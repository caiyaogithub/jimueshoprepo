package com.jimueshop.domain;

import java.util.Date;

/**
 * 
 * @description 实体类，对应TAB_COMMENT表，存储商品评论
 *
 * @author hello world
 *
 * @modifyTime 2015年9月28日
 */
public class Comment {
	private Integer id ;
	private String userName ;
	private String title ;
	private Product product ;
	private String content ;
	private Date commentDate ;
	private String reply ;
	private String flag ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
}
