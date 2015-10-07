package com.jimueshop.admin.action;

import com.jimueshop.admin.service.SuperTypeService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.SuperType;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description 查询单个大类详细信息
 *
 * @author hello world
 *
 * @modifyTime 2015年10月4日
 */
public class QuerySingleSuperTypeAction extends ActionSupport {
	
	private Integer id ;
	
	private SuperTypeService superTypeService ;
	
	private SuperType superType ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;

	@Override
	public String execute() throws Exception {
		
		superType = superTypeService.querySuperTypeById(id) ;
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
		
	}
	
	public SuperType getSuperType() {
		return superType;
	}

	public String getResult() {
		return result;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setSuperTypeService(SuperTypeService superTypeService) {
		this.superTypeService = superTypeService;
	}
	
}
