package com.jimueshop.admin.action;

import com.jimueshop.admin.service.AttrService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.Attr;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description ��ѯ����������ϸ��Ϣ
 *
 * @author hello world
 *
 * @modifyTime 2015��10��4��
 */
public class QuerySingleAttrAction extends ActionSupport {
	
	private Integer id ;
	
	private AttrService attrService ;
	
	private Attr attr ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;

	@Override
	public String execute() throws Exception {
		
		attr = attrService.queryAttrById(id) ;
		
		//System.out.println(attr.getSubType().getSubTypeName()) ;
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
		
	}
	
	public Attr getAttr() {
		return attr;
	}

	public String getResult() {
		return result;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setAttrService(AttrService attrService) {
		this.attrService = attrService;
	}
	
}
