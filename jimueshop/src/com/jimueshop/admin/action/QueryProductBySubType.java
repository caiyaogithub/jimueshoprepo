package com.jimueshop.admin.action;

import com.jimueshop.admin.service.ProductService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.Page;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description 根据小类查询商品
 *
 * @author hello world
 *
 * @modifyTime 2015年10月10日
 */
public class QueryProductBySubType extends ActionSupport {
	
	private Integer subTypeId ;
	
	private Integer currentPage ;
	
	private ProductService productService ;
	
	private Page page ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;

	@Override
	public String execute() throws Exception {
		
		page = productService.queryProductBySubTypeId(currentPage, subTypeId) ; 
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
		
	}
	
	public Page getPage() {
		return page;
	}

	public String getResult() {
		return result;
	}

	public void setSubTypeId(Integer subTypeId) {
		this.subTypeId = subTypeId;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
}
