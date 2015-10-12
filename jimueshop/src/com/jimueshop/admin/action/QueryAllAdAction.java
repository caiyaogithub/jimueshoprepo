package com.jimueshop.admin.action;

import com.jimueshop.admin.service.AdService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.Page;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description 查询所有的广告信息
 *
 * @author hello world
 *
 * @modifyTime 2015年9月29日
 */
public class QueryAllAdAction extends ActionSupport {
	
	private AdService adService ;
	
	private int currentPage ;
	
	private Page page ;
	
	private String result  = ActionResultInfo.PARAMS_ERROR ; 
	
	@Override
	public String execute() throws Exception {
		
		page = adService.findAllAdByPage(currentPage) ;
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
		
	}
	
	public void setAdService(AdService adService) {
		this.adService = adService;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public String getResult() {
		return result;
	}

	public Page getPage() {
		return page;
	}
}
