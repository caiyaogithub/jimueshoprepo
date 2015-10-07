package com.jimueshop.admin.action;

import java.util.List;

import com.jimueshop.admin.service.UserService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @description �л��û�״̬��
 * 						����û�״̬Ϊ���� �� ����ת���ɶ���
 * 						����û�״̬Ϊ���� �� ����ת��������
 * 				�ͻ������������
 * 						int operator // ��������1: �����˻�     2�� �ⶳ�˻�
 * 						String 1,2,3 // ��Ҫ�����Ķ�����
 *
 * @author hello world
 *
 * @modifyTime 2015��9��30��
 */
public class ToggleUserStatusAction extends ActionSupport {

	private UserService userService;

	private List<Integer> idList ;
	
	private Integer operator ; // �������ͣ� �����˻� : 1   �ⶳ�˻� : 2 

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
