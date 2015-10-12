package com.jimueshop.admin.service.impl;

import java.util.Map;

import com.jimueshop.admin.dao.CommentDao;
import com.jimueshop.admin.service.CommentService;
import com.jimueshop.domain.Comment;
import com.jimueshop.domain.Page;

public class CommentServiceImpl implements CommentService {

	private CommentDao commentDao ;
	@Override
	public Page queryAllComment(int currentPage) {
		String hql = "from Comment " ;
		return commentDao.getPageReady(currentPage, hql) ;
	}

	@Override
	public Page querySomeCommentsByProperties(int currentPage,
			Map<String, String> params) {
		return commentDao.findByProperties(currentPage, params) ;
 	}

	@Override
	public void replyComment(int commentId, String replyContent) {
		Comment comment = commentDao.findById(commentId) ;
		comment.setReply(replyContent) ;
		comment.setFlag("ÒÑ»Ø¸´") ;
	}

	public void setCommentDao(CommentDao commentDao) {
		this.commentDao = commentDao;
	}
	@Override
	public void addComment(Comment instance) {
		commentDao.save(instance) ;
	}
	@Override
	public Comment queryCommentById(int commentId) {
		return commentDao.findById(commentId) ;
	}
}
