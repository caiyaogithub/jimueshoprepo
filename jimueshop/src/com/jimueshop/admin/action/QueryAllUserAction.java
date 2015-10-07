package com.jimueshop.admin.action;

import com.jimueshop.admin.service.UserService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.Page;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description ��ѯ���е��û���Ϣ
 *
 * @author hello world
 *
 * @modifyTime 2015��9��29��
 */
public class QueryAllUserAction extends ActionSupport {
	
	private UserService userService ;
	
	private int currentPage ;
	
	private Page page ;
	
	private String result  = ActionResultInfo.PARAMS_ERROR ; 
	
	@Override
	public String execute() throws Exception {
		
		page = userService.findAllUserByPage(currentPage) ;
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
		
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public String getResult() {
		return result;
	}

	public void setPage(Page page) {
		this.page = page;
	}
}
