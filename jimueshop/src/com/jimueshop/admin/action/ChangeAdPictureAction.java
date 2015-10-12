package com.jimueshop.admin.action;

import java.io.File;
import java.util.UUID;

import com.jimueshop.admin.service.AdService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.common.DateTimeUtil;
import com.jimueshop.common.EshopConstant;
import com.jimueshop.common.ImageUtils;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description 更换广告图片
 *
 * @author hello world
 *
 * @modifyTime 2015年10月11日
 */
public class ChangeAdPictureAction extends ActionSupport {
	
	private Integer adId ;
	
	private File adPicture ;
	
	private String adPictureFileName ;
	
	private AdService adService ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;

	@Override
	public String execute() throws Exception {
		
		String relativePath = DateTimeUtil.getCurrentDate() + "/" + UUID.randomUUID().toString() + adPictureFileName ;
		
		String savePath = EshopConstant.SAVE_PATH + "/" + relativePath ;
		
		ImageUtils.writeImageToFile( adPicture , savePath ) ;
		
		adService.changeAdImgPath(adId , EshopConstant.IMG_PATH + relativePath ) ; 
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
	}
	public String getResult() {
		return result;
	}

	public void setAdId(Integer adId) {
		this.adId = adId;
	}

	public void setAdPicture(File adPicture) {
		this.adPicture = adPicture;
	}

	public void setAdPictureFileName(String adPictureFileName) {
		this.adPictureFileName = adPictureFileName;
	}

	public void setAdService(AdService adService) {
		this.adService = adService;
	}
}

