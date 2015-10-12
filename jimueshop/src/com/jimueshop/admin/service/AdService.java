package com.jimueshop.admin.service;

import java.util.List;
import java.util.Map;

import com.jimueshop.domain.Ad;
import com.jimueshop.domain.Page;

public interface AdService {
	/**
	 * 获取指定页的所有广告信息
	 * @param currentPage 页数
	 * @return Page对象
	 */
	public Page queryAllAdByPage(int currentPage ) ;
	/**
	 * 根据广告ID删除广告
	 * @param adId
	 */
	public void deleteAdById(int adId ) ;
	/**
	 * 通过广告ID查询广告 
	 * @param adId
	 * @return
	 */
	public Ad queryAdById(int adId ) ;
	/**
	 * 根据ID列表批量删除广告
	 * @param ids
	 */
	public void deleteManyAdByIds(List<Integer> ids ) ;
	/**
	 * 通过多属性模糊查询广告
	 * @param params 属性名--值映射
	 * @param currentPage 
	 * @return
	 */
	public Page querySomeAdByProperties(int currentPage , Map<String , String > params ) ;
	/**
	 * 添加广告 
	 * @param instance
	 */
	public void addAd(Ad instance ) ;
	/**
	 * 更新广告
	 * @param instance
	 */
	public void updateAd(Ad instance ) ;
	/**
	 * 查询某一小类下所有的广告
	 * @param currentPage 
	 * @param superTypeId
	 * @return
	 */
	public Page queryAdBySubTypeId( int currentPage , int subTypeId ) ;
	/**
	 * 更换广告图片
	 * @param adId 广告id
	 * @param newAdPicturePath 新的广告图片路径
	 */
	public void changeAdImgPath(int adId , String newAdPicturePath ) ;
}
