package com.jimueshop.admin.action;

import java.util.ArrayList;
import java.util.List;

import com.jimueshop.admin.service.AdService;
import com.jimueshop.common.ActionResultInfo;
import com.jimueshop.common.Convertor;
import com.jimueshop.domain.AttrItem;
import com.jimueshop.domain.Ad;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @description �޸Ĺ��: ���޸ĳ�ͼƬ·�����������
 *
 * @author hello world
 *
 * @modifyTime 2015��10��10��
 */
public class ModifyAdAction extends ActionSupport {
	
	private Ad ad ;
	
	private AdService adService ;
	
	private String result = ActionResultInfo.PARAMS_ERROR ;
	
	@Override
	public String execute() throws Exception {
		
		// ��ԭʼ��ͼƬ·�����ý��µ�ad������
		ad.setPicturePath(adService.queryAdById(ad.getId()).getPicturePath()) ;
		
		adService.updateAd(ad) ;
		
		result = ActionResultInfo.SUCCESS ;
		
		return SUCCESS ;
	}

	public Ad getAd() {
		return ad;
	}

	public void setAd(Ad ad) {
		this.ad = ad;
	}

	public String getResult() {
		return result;
	}

	public void setAdService(AdService adService) {
		this.adService = adService;
	}
}
