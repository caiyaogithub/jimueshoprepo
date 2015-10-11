package com.jimueshop.admin.action;

import com.jimueshop.admin.service.ProductService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.domain.Product;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description ��ѯ������Ʒ��ϸ��Ϣ
 *
 * @author hello world
 *
 * @modifyTime 2015��10��4��
 */
public class QuerySingleProductAction extends ActionSupport {
	
	private Integer id ;
	
	private ProductService productService ;
	
	private Product product ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;

	@Override
	public String execute() throws Exception {
		
		product = productService.queryProductById(id) ;
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
		
	}
	
	public Product getProduct() {
		return product;
	}

	public String getResult() {
		return result;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
}
