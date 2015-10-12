package com.jimueshop.admin.service.impl;

import java.util.List;
import java.util.Map;

import com.jimueshop.admin.dao.AdDao;
import com.jimueshop.admin.dao.SuperTypeDao;
import com.jimueshop.admin.service.AdService;
import com.jimueshop.domain.Page;
import com.jimueshop.domain.Ad;
import com.jimueshop.domain.SuperType;

public class AdServiceImpl implements AdService {
	
	private AdDao adDao ;
	
	@Override
	public Page queryAllAdByPage(int currentPage) {
		return adDao.getPageReady(currentPage, "from Ad" ) ;
	}

	@Override
	public void deleteAdById(int adId) {
		Ad ad = queryAdById(adId) ;
		adDao.delete(ad) ;
	}

	@Override
	public Ad queryAdById(int adId) {
		return adDao.findById(adId) ;
	}
	@Override
	public void deleteManyAdByIds(List<Integer> ids) {
		adDao.deleteByPropertyWithHQL("id", ids ) ;
	}
	@Override
	public Page querySomeAdByProperties(int currentPage , Map<String, String> params) {
		return adDao.findByProperties(currentPage, params) ;
	}
	@Override
	public void addAd(Ad instance) {
		adDao.save(instance) ;
	}
	@Override
	public void updateAd(Ad instance) {
		adDao.update(instance) ;
	}
	@Override
	public Page queryAdBySubTypeId(int currentPage, int subTypeId) {
		
		String hql = String.format( "from Ad where subType.id = '%s' " , subTypeId )  ;
		
		return adDao.getPageReady(currentPage, hql) ;
		
	}
	@Override
	public void changeAdImgPath(int adId, String newAdPicturePath) {
		
		Ad ad = adDao.findById(adId) ;
		
		ad.setPicturePath(newAdPicturePath) ;
	}
	public void setAdDao(AdDao adDao) {
		this.adDao = adDao ;
	}
	
}
