package com.jimueshop.admin.service.impl;

import java.util.List;

import com.jimueshop.admin.dao.UserDao;
import com.jimueshop.admin.service.UserService;
import com.jimueshop.domain.Page;
import com.jimueshop.domain.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao ;
	@Override
	public Page findAllUserByPage(int currentPage) {
		
		return userDao.getPageReady(currentPage, "from User ") ;
		
	}
	
	@Override
	public void toggleUserStatus(int userId) {
		User user = userDao.findById(userId ) ;
			String status = user.getStatus().trim().equals("冻结") ? "正常" : "冻结" ;
			user.setStatus(status) ;
			userDao.update(user) ;
	}
	@Override
	public void deleteUserById(int userId) {
		User user = userDao.findById(userId) ;
			userDao.delete(user) ;
	}
	
	@Override
	public User findUserById(int userId) {
		return userDao.findById(userId) ;
	}
	
	@Override
	public void deleteManyUserByIds(List<Integer> idList) {
		userDao.deleteByPropertyWithHQL( "id" , idList );
	}
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public void freezeManyUserByIds(List<Integer> idList) {
		userDao.updateManyByProperty("id", idList, "status", "冻结") ;
	}
	@Override
	public void unfreezeManyUserByIds(List<Integer> idList) {
		userDao.updateManyByProperty("id", idList, "status", "正常") ;
	}
}
