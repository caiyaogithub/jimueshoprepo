package com.jimueshop.admin.action;

import java.util.List;

import com.jimueshop.admin.service.UserService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @description ɾ���û�
 * 				��������� nameΪidList���ַ�����
 *
 * @author hello world
 *
 * @modifyTime 2015��9��30��
 */
public class DeleteUserAction extends ActionSupport {

	private UserService userService ;

	private List<Integer> idList ; 

	private String result = ActionResultInfo.PARAMS_ERROR ;

	@Override
	public String execute() throws Exception {
		
			userService.deleteManyUserByIds(idList) ;
			
			result = ActionResultInfo.SUCCESS ;
			
			return SUCCESS ;
	}

	public void setIdList(List<Integer> idList) {
		this.idList = idList;
	}


	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getResult() {
		return result;
	}

}
