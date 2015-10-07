package com.jimueshop.admin.action;

import java.util.List;

import com.jimueshop.admin.service.UserService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @description 切换用户状态：
 * 						如果用户状态为正常 ， 则将其转换成冻结
 * 						如果用户状态为冻结 ， 则将其转换成正常
 * 				客户端请求参数：
 * 						int operator // 操作类型1: 冻结账户     2： 解冻账户
 * 						String 1,2,3 // 需要操作的订单号
 *
 * @author hello world
 *
 * @modifyTime 2015年9月30日
 */
public class ToggleUserStatusAction extends ActionSupport {

	private UserService userService;

	private List<Integer> idList ;
	
	private Integer operator ; // 操作类型： 冻结账户 : 1   解冻账户 : 2 

	private String result = ActionResultInfo.PARAMS_ERROR ;

	@Override
	public String execute() throws Exception {
		
		if(operator == 1 ){
			
			userService.freezeManyUserByIds(idList) ;
			
		}else{
			
			userService.unfreezeManyUserByIds(idList) ;
			
		}
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
	}
	
	public String getResult() {
		return result;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void setIdList(List<Integer> idList) {
		this.idList = idList;
	}

	public void setOperator(Integer operator) {
		this.operator = operator;
	}

}
