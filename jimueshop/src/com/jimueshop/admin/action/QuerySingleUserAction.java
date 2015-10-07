package com.jimueshop.admin.action;

import com.jimueshop.admin.service.UserService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.User;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description 通过用户ID查询单个用户
 *
 * @author hello world
 *
 * @modifyTime 2015年9月30日
 */
public class QuerySingleUserAction extends ActionSupport {
	
	private UserService userService ;
	
	private Integer id ;
	
	private User user ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;
	
	@Override
	public String execute() throws Exception {
		
		user = userService.findUserById( id ) ;
		
		if(user == null ){
			
			result = ActionResultInfo.USER_NOT_EXIST ;
			
		}
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public String getResult() {
		return result;
	}
	
}
