package com.jimueshop.admin.service;

import java.util.Map;

import com.jimueshop.domain.Comment;
import com.jimueshop.domain.Page;

/**
 * 
 * @description 定义评论相关的功能
 *
 * @author hello world
 *
 * @modifyTime 2015年10月12日
 */
public interface CommentService {
	/**
	 * 分页查询所有评论
	 * @param currentPage
	 * @return
	 */
	public Page queryAllComment(int currentPage ) ;
	/**
	 * 通过多属性模糊查询评论
	 * @param params 属性名--值映射
	 * @param currentPage 
	 * @return
	 */
	public Page querySomeCommentsByProperties(int currentPage , Map<String , String > params ) ;
	/**
	 * 回复评论
	 * @param commentId 评论id
	 * @param replyContent 评论内容
	 */
	public void replyComment(int commentId , String replyContent ) ;
	/**
	 * 仅作添加测试数据用
	 * @param instance
	 */
	public void addComment(Comment instance ) ;
	/**
	 * 通过id查找评论
	 * @param commentId
	 * @return
	 */
	public Comment queryCommentById(int commentId ) ;
}
