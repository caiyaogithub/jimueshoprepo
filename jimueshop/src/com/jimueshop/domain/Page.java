package com.jimueshop.domain;

import java.util.List;

public class Page {
	public static final int PAGESIZE = 3;
	private Integer totalPages;
	private Integer currentPage;
	private Integer totalNums;
	private List list;
	public Integer getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getTotalNums() {
		return totalNums;
	}
	public void setTotalNums(Integer totalNums) {
		this.totalNums = totalNums;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
}
