package com.jimueshop.admin.action;

import java.util.List;

import com.jimueshop.admin.service.AttrService;
import com.jimueshop.common.ActionResultInfo;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description ɾ������
 *
 * @author hello world
 *
 * @modifyTime 2015��10��1��
 */
public class DeleteAttrAction extends ActionSupport {
	
	private AttrService attrService ;
	
	private List<Integer> idList  ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;
	
	
	@Override
	public String execute() throws Exception {
		
			attrService.deleteManyAttrByIds(idList) ;
			
			result = ActionResultInfo.SUCCESS ;
			
		return SUCCESS ;		
	}
	
	public String getResult() {
		return result;
	}
	public void setAttrService(AttrService attrService) {
		this.attrService = attrService;
	}

	public void setIdList(List<Integer> idList) {
		this.idList = idList;
	}
}
