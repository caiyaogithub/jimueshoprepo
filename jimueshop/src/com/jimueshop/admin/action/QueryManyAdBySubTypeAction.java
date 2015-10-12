package com.jimueshop.admin.action;

import com.jimueshop.admin.service.AdService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.Page;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description 根据小类查询广告
 *
 * @author hello world
 *
 * @modifyTime 2015年10月10日
 */
public class QueryManyAdBySubTypeAction extends ActionSupport {
	
	private Integer subTypeId ;
	
	private Integer currentPage ;
	
	private AdService adService ;
	
	private Page page ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;

	@Override
	public String execute() throws Exception {
		
		page = adService.queryAdBySubTypeId(currentPage, subTypeId) ; 
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
		
	}
	
	public Page getPage() {
		return page;
	}

	public String getResult() {
		return result;
	}

	public void setSubTypeId(Integer subTypeId) {
		this.subTypeId = subTypeId;
	}

	public void setAdService(AdService adService) {
		this.adService = adService;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
}
