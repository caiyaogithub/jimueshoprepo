package com.jimueshop.admin.action;

import java.util.List;
import java.util.Map;

import com.jimueshop.admin.service.ProductService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.Page;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description 通过属性查找商品
 *
 * @author hello world
 *
 * @modifyTime 2015年10月11日
 */
public class QueryManyProductByAttrItem extends ActionSupport {
	
	private List<Integer> attrItemIds ;
	
	private Map<String,String> extraParams ;
	
	private Integer currentPage ;
	
	private ProductService productService ;
	
	private Page page ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;

	@Override
	public String execute() throws Exception {
		
		page = productService.queryProductByAttrItem(currentPage, attrItemIds, extraParams) ;
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
	}

	public String getResult() {
		return result;
	}

	public void setAttrItemIds(List<Integer> attrItemIds) {
		this.attrItemIds = attrItemIds;
	}

	public void setExtraParams(Map<String, String> extraParams) {
		this.extraParams = extraParams;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public Page getPage() {
		return page;
	}
}
