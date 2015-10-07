package com.jimueshop.admin.action;

import com.jimueshop.admin.service.AttrService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.Attr;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description ��Ӻ��޸�����
 *
 * @author hello world
 *
 * @modifyTime 2015��10��4��
 */
public class AddOrModifyAttrAction extends ActionSupport {
	
	private Attr attr ;
	
	private String operator ; // ��ʾ��ʲô������ ��� --- 1   or ����  ---2  
	
	private AttrService attrService ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;

	@Override
	public String execute() throws Exception {
		
		if(operator.trim().equals("1")){
			
			attrService.addAttr(attr) ;
			
		}else{
			
			attrService.updateAttr(attr) ;
			
		}
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
	}

	public String getResult() {
		return result;
	}

	public void setAttr(Attr attr) {
		this.attr = attr;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public void setAttrService(AttrService attrService) {
		this.attrService = attrService;
	}

	public Attr getAttr() {
		return attr;
	}
}
