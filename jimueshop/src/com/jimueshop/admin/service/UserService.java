package com.jimueshop.admin.service;

import java.util.List;

import com.jimueshop.domain.Page;
import com.jimueshop.domain.User;

public interface UserService {
	/**
	 * 获取指定页的所有用户信息
	 * @param currentPage 页数
	 * @return Page对象
	 */
	public Page findAllUserByPage(int currentPage ) ;
	/**
	 * 切换用户状态， 
	 *  如果指定用户状态为正常，则将用户状态改变为冻结
	 *  如果指定用户状态为冻结，则将用户状态改变为正常 
	 * @param userId
	 */
	public void toggleUserStatus(int userId ) ; 
	/**
	 * 
	 * @param userId
	 */
	public void  deleteUserById(int userId ) ;
	/**
	 * 通过用户ID查询用户 
	 * @param userId
	 * @return
	 */
	public User findUserById(int userId ) ;
	/**
	 * 删除IDList中ID指定的所有用户
	 * @param idList ID列表
	 */
	public void deleteManyUserByIds(List<Integer> idList) ;
	/**
	 * 批量冻结账户
	 * @param idList
	 */
	public void freezeManyUserByIds(List<Integer> idList ) ;
	/**
	 * 批量解冻账户
	 * @param idList
	 */
	public void unfreezeManyUserByIds(List<Integer> idList ) ;
}
