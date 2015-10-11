package com.jimueshop.admin.action;

import java.io.File;
import java.util.UUID;

import com.jimueshop.admin.service.ProductService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.common.DateTimeUtil;
import com.jimueshop.common.EshopConstant;
import com.jimueshop.common.ImageUtils;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description 更换商品图片
 *
 * @author hello world
 *
 * @modifyTime 2015年10月11日
 */
public class ChangeProductPictureAction extends ActionSupport {
	
	private Integer productId ;
	
	private File productPicture ;
	
	private String productPictureFileName ;
	
	private ProductService productService ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;

	@Override
	public String execute() throws Exception {
		
		String relativePath = DateTimeUtil.getCurrentDate() + "/" + UUID.randomUUID().toString() + productPictureFileName ;
		
		String savePath = EshopConstant.SAVE_PATH + "/" + relativePath ;
		
		ImageUtils.writeImageToFile( productPicture , savePath ) ;
		
		productService.changeProductImgPath(productId , EshopConstant.IMG_PATH + relativePath ) ; 
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
	}
	public String getResult() {
		return result;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public void setProductPicture(File productPicture) {
		this.productPicture = productPicture;
	}

	public void setProductPictureFileName(String productPictureFileName) {
		this.productPictureFileName = productPictureFileName;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
}

