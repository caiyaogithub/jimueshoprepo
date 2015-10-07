package com.jimueshop.domain;

import java.util.Date;

/**
 * 
 * @description 数据库实体类，对应于数据库TAB_NOTICE表。存储公告信息
 *
 * @author hello world
 *
 * @modifyTime 2015年9月28日
 */
public class Notice {
	private Integer id ;
	private String noticeTitle ;
	private String noticeContent ;
	private Date noticeTime ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public String getNoticeContent() {
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	public Date getNoticeTime() {
		return noticeTime;
	}
	public void setNoticeTime(Date noticeTime) {
		this.noticeTime = noticeTime;
	}
}
