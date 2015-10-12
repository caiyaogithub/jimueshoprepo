package com.jimueshop.admin.action;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.jimueshop.admin.service.AdService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.common.Convertor;
import com.jimueshop.common.DateTimeUtil;
import com.jimueshop.common.EshopConstant;
import com.jimueshop.common.ImageUtils;
import com.jimueshop.domain.AttrItem;
import com.jimueshop.domain.Ad;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description 添加广告
 *
 * @author hello world
 *
 * @modifyTime 2015年10月10日
 */
public class AddAdAction extends ActionSupport {
	
	private Ad ad ;
	
	private File uploadImage ; 
	
	private String uploadImageFileName ;
	
	private AdService adService ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;
	
	@Override
	public String execute() throws Exception {
		
		String relativePath = DateTimeUtil.getCurrentDate() + "/" + UUID.randomUUID().toString() + uploadImageFileName ;
		
		String savePath = EshopConstant.SAVE_PATH + "/" + relativePath ;
		
		ImageUtils.writeImageToFile( uploadImage , savePath ) ;
		
		ad.setPicturePath(EshopConstant.IMG_PATH + relativePath ) ;
		
		adService.addAd(ad) ;
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
	}

	public Ad getAd() {
		return ad;
	}

	public void setAd(Ad ad) {
		this.ad = ad;
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

	public void setAdService(AdService adService) {
		this.adService = adService;
	}
}
