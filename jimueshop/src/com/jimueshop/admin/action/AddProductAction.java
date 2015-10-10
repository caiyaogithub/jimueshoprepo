package com.jimueshop.admin.action;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.jimueshop.admin.service.ProductService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.common.Convertor;
import com.jimueshop.common.DateTimeUtil;
import com.jimueshop.common.EshopConstant;
import com.jimueshop.common.ImageUtils;
import com.jimueshop.domain.AttrItem;
import com.jimueshop.domain.Product;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description 添加商品
 *
 * @author hello world
 *
 * @modifyTime 2015年10月10日
 */
public class AddProductAction extends ActionSupport {
	
	private Product product ;
	
	private List<AttrItem> attrItems = new ArrayList<AttrItem>() ; // 因为直接将客户端表单中的数据转换成Set很麻烦，
																   // 所以就先存储成List在转换成Set然后设置进product对象中
	private File uploadImage ; 
	
	private String uploadImageFileName ;
	
	private ProductService productService ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;
	
	@Override
	public String execute() throws Exception {
		
		product.setAttrItems(Convertor.ListToSet(attrItems)) ;
		
		String relativePath = DateTimeUtil.getCurrentDate() + "/" + UUID.randomUUID().toString() + uploadImageFileName ;
		
		String savePath = EshopConstant.SAVE_PATH + "/" + relativePath ;
		
		ImageUtils.writeImageToFile( uploadImage , savePath ) ;
		
		product.setPicturePath(EshopConstant.IMG_PATH + relativePath ) ;
		
		productService.addProduct(product) ;
		
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

	public File getUploadImage() {
		return uploadImage;
	}

	public void setUploadImage(File uploadImage) {
		this.uploadImage = uploadImage;
	}

	public String getUploadImageFileName() {
		return uploadImageFileName;
	}

	public void setUploadImageFileName(String uploadImageFileName) {
		this.uploadImageFileName = uploadImageFileName;
	}

	public String getResult() {
		return result;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
}
