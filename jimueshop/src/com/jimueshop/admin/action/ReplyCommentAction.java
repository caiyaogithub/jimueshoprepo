package com.jimueshop.admin.action;

import com.jimueshop.admin.service.CommentService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.Comment;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description 回复评论
 *
 * @author hello world
 *
 * @modifyTime 2015年10月12日
 */
public class ReplyCommentAction extends ActionSupport {
	
	private Integer commentId ;
	
	private String replyContent ;
	
	private CommentService commentService ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;

	@Override
	public String execute() throws Exception {
		
		Comment comment = commentService.queryCommentById(commentId) ;
		
		result = comment==null?(ActionResultInfo.COMMENT_NOT_EXIST):(comment.getFlag().equals("已回复")?ActionResultInfo.COMMENT_ALREADY_REPLY:"") ;
		
		if(!result.equals("")) return SUCCESS ;
		
		commentService.replyComment(commentId, replyContent) ;
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
	}
	public String getResult() {
		return result;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public void setCommentService(CommentService commentService) {
		this.commentService = commentService;
	}
	
}
