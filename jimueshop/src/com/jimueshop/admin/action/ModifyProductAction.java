package com.jimueshop.admin.action;

import java.util.ArrayList;
import java.util.List;

import com.jimueshop.admin.service.ProductService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.common.Convertor;
import com.jimueshop.domain.AttrItem;
import com.jimueshop.domain.Product;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description 修改商品: 仅修改除图片路径以外的属性
 *
 * @author hello world
 *
 * @modifyTime 2015年10月10日
 */
public class ModifyProductAction extends ActionSupport {
	
	private Product product ;
	
	private List<AttrItem> attrItems = new ArrayList<AttrItem>() ; 
	
	private ProductService productService ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;
	
	@Override
	public String execute() throws Exception {
		
		product.setAttrItems(Convertor.ListToSet(attrItems)) ;
		// 将原始的图片路径设置进新的product对象中
		product.setPicturePath(productService.queryProductById(product.getId()).getPicturePath()) ;
		
		productService.updateProduct(product) ;
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<AttrItem> getAttrItems() {
		return attrItems;
	}

	public void setAttrItems(List<AttrItem> attrItems) {
		this.attrItems = attrItems;
	}

	public String getResult() {
		return result;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
}
