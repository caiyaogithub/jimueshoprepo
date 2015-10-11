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
 * @description �޸���Ʒ: ���޸ĳ�ͼƬ·�����������
 *
 * @author hello world
 *
 * @modifyTime 2015��10��10��
 */
public class ModifyProductAction extends ActionSupport {
	
	private Product product ;
	
	private List<AttrItem> attrItems = new ArrayList<AttrItem>() ; 
	
	private ProductService productService ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;
	
	@Override
	public String execute() throws Exception {
		
		product.setAttrItems(Convertor.ListToSet(attrItems)) ;
		// ��ԭʼ��ͼƬ·�����ý��µ�product������
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
