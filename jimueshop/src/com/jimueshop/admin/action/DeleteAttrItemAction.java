package com.jimueshop.admin.action;

import java.util.List;

import com.jimueshop.admin.service.AttrItemService;
import com.jimueshop.common.ActionResultInfo;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description 删除属性项
 *
 * @author hello world
 *
 * @modifyTime 2015年10月1日
 */
public class DeleteAttrItemAction extends ActionSupport {
	
	private AttrItemService attrItemService ;
	
	private List<Integer> idList  ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;
	
	
	@Override
	public String execute() throws Exception {
		
			attrItemService.deleteManyAttrItemByIds(idList) ;
			
			result = ActionResultInfo.SUCCESS ;
			
		return SUCCESS ;		
	}
	
	public String getResult() {
		return result;
	}
	public void setAttrItemService(AttrItemService attrItemService) {
		this.attrItemService = attrItemService;
	}

	public void setIdList(List<Integer> idList) {
		this.idList = idList;
	}
}
