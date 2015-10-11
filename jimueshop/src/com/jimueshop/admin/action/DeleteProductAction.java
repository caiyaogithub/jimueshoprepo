package com.jimueshop.admin.action;

import java.util.List;

import com.jimueshop.admin.service.ProductService;
import com.jimueshop.common.ActionResultInfo;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description 删除商品
 *
 * @author hello world
 *
 * @modifyTime 2015年10月1日
 */
public class DeleteProductAction extends ActionSupport {
	
	private ProductService productService ;
	
	private List<Integer> idList  ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;
	
	
	@Override
	public String execute() throws Exception {
		
			productService.deleteManyProductByIds(idList) ;
			
			result = ActionResultInfo.SUCCESS ;
			
		return SUCCESS ;		
	}
	
	public String getResult() {
		return result;
	}
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public void setIdList(List<Integer> idList) {
		this.idList = idList;
	}
}
