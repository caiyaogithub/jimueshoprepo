package com.jimueshop.admin.service;

import java.util.List;

import com.jimueshop.domain.Page;
import com.jimueshop.domain.User;

public interface UserService {
	/**
	 * ��ȡָ��ҳ�������û���Ϣ
	 * @param currentPage ҳ��
	 * @return Page����
	 */
	public Page findAllUserByPage(int currentPage ) ;
	/**
	 * �л��û�״̬�� 
	 *  ���ָ���û�״̬Ϊ���������û�״̬�ı�Ϊ����
	 *  ���ָ���û�״̬Ϊ���ᣬ���û�״̬�ı�Ϊ���� 
	 * @param userId
	 */
	public void toggleUserStatus(int userId ) ; 
	/**
	 * 
	 * @param userId
	 */
	public void  deleteUserById(int userId ) ;
	/**
	 * ͨ���û�ID��ѯ�û� 
	 * @param userId
	 * @return
	 */
	public User findUserById(int userId ) ;
	/**
	 * ɾ��IDList��IDָ���������û�
	 * @param idList ID�б�
	 */
	public void deleteManyUserByIds(List<Integer> idList) ;
	/**
	 * ���������˻�
	 * @param idList
	 */
	public void freezeManyUserByIds(List<Integer> idList ) ;
	/**
	 * �����ⶳ�˻�
	 * @param idList
	 */
	public void unfreezeManyUserByIds(List<Integer> idList ) ;
}
