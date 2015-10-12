package com.jimueshop.admin.action;

import java.util.List;

import com.jimueshop.admin.service.AdService;
import com.jimueshop.common.ActionResultInfo;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description 删除广告
 *
 * @author hello world
 *
 * @modifyTime 2015年10月1日
 */
public class DeleteAdAction extends ActionSupport {
	
	private AdService adService ;
	
	private List<Integer> idList  ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;
	
	
	@Override
	public String execute() throws Exception {
		
			adService.deleteManyAdByIds(idList) ;
			
			result = ActionResultInfo.SUCCESS ;
			
		return SUCCESS ;		
	}
	
	public String getResult() {
		return result;
	}
	public void setAdService(AdService adService) {
		this.adService = adService;
	}

	public void setIdList(List<Integer> idList) {
		this.idList = idList;
	}
}
