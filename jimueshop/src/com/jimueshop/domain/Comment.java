package com.jimueshop.domain;

import java.util.Date;

/**
 * 
 * @description ʵ���࣬��ӦTAB_COMMENT���洢��Ʒ����
 *
 * @author hello world
 *
 * @modifyTime 2015��9��28��
 */
public class Comment {
	private Integer id ;
	private String userName ;
	private String title ;
	private Product product ;
	private String content ;
	private Date commentDate ;
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
}
