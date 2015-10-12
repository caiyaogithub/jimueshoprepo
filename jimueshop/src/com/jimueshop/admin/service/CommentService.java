package com.jimueshop.admin.service;

import java.util.Map;

import com.jimueshop.domain.Comment;
import com.jimueshop.domain.Page;

/**
 * 
 * @description ����������صĹ���
 *
 * @author hello world
 *
 * @modifyTime 2015��10��12��
 */
public interface CommentService {
	/**
	 * ��ҳ��ѯ��������
	 * @param currentPage
	 * @return
	 */
	public Page queryAllComment(int currentPage ) ;
	/**
	 * ͨ��������ģ����ѯ����
	 * @param params ������--ֵӳ��
	 * @param currentPage 
	 * @return
	 */
	public Page querySomeCommentsByProperties(int currentPage , Map<String , String > params ) ;
	/**
	 * �ظ�����
	 * @param commentId ����id
	 * @param replyContent ��������
	 */
	public void replyComment(int commentId , String replyContent ) ;
	/**
	 * ������Ӳ���������
	 * @param instance
	 */
	public void addComment(Comment instance ) ;
	/**
	 * ͨ��id��������
	 * @param commentId
	 * @return
	 */
	public Comment queryCommentById(int commentId ) ;
}
