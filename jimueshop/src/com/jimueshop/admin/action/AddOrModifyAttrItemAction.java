package com.jimueshop.admin.action;

import com.jimueshop.admin.service.AttrItemService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.AttrItem;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description 添加和修改属性项
 *
 * @author hello world
 *
 * @modifyTime 2015年10月4日
 */
public class AddOrModifyAttrItemAction extends ActionSupport {
	
	private AttrItem attrItem ;
	
	private String operator ; // 标示做什么操作： 添加 --- 1   or 更新  ---2  
	
	private AttrItemService attrItemService ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;

	@Override
	public String execute() throws Exception {
		
		if(operator.trim().equals("1")){
			
			attrItemService.addAttrItem(attrItem) ;
			
		}else{
			
			attrItemService.updateAttrItem(attrItem) ;
			
		}
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
	}

	public String getResult() {
		return result;
	}

	public void setAttrItem(AttrItem attrItem) {
		this.attrItem = attrItem;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public void setAttrItemService(AttrItemService attrItemService) {
		this.attrItemService = attrItemService;
	}

	public AttrItem getAttrItem() {
		return attrItem;
	}
}
