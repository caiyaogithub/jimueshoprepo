package com.jimueshop.admin.action;

import com.jimueshop.admin.service.AdService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.Ad;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description 查询单个广告详细信息
 *
 * @author hello world
 *
 * @modifyTime 2015年10月4日
 */
public class QuerySingleAdAction extends ActionSupport {
	
	private Integer id ;
	
	private AdService adService ;
	
	private Ad ad ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;

	@Override
	public String execute() throws Exception {
		
		ad = adService.queryAdById(id) ;
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
		
	}
	
	public Ad getAd() {
		return ad;
	}

	public String getResult() {
		return result;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setAdService(AdService adService) {
		this.adService = adService;
	}
	
}
