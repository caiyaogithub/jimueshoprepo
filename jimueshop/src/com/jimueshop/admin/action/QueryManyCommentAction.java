package com.jimueshop.admin.action;

import java.util.Map;

import com.jimueshop.admin.service.CommentService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.Page;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description 根据条件分页查询评论
 *
 * @author hello world
 *
 * @modifyTime 2015年10月12日
 */
public class QueryManyCommentAction extends ActionSupport {
	
	private Map<String,String> condition ;
	
	private Integer currentPage ;
	
	private CommentService commentService ;
	
	private Page page ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;

	@Override
	public String execute() throws Exception {
		
		page = commentService.querySomeCommentsByProperties(currentPage, condition ) ;
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
	}
	
	public Map<String, String> getCondition() {
		return condition;
	}

	public void setCondition(Map<String, String> condition) {
		this.condition = condition;
	}

	public Page getPage() {
		return page;
	}

	public String getResult() {
		return result;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public void setCommentService(CommentService commentService) {
		this.commentService = commentService;
	}
	
}
