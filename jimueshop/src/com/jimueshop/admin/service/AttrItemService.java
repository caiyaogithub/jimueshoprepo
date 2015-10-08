package com.jimueshop.admin.service;

import java.util.List;
import java.util.Map;

import com.jimueshop.domain.AttrItem;
import com.jimueshop.domain.Page;

public interface AttrItemService {
	/**
	 * 获取指定页的所有属性项信息
	 * @param currentPage 页数
	 * @return Page对象
	 */
	public Page queryAllAttrItemByPage(int currentPage ) ;
	/**
	 * 根据属性项ID删除属性项
	 * @param attrItemId
	 */
	public void deleteAttrItemById(int attrItemId ) ;
	/**
	 * 通过属性项ID查询属性项 
	 * @param attrItemId
	 * @return
	 */
	public AttrItem queryAttrItemById(int attrItemId ) ;
	/**
	 * 根据ID列表批量删除属性项
	 * @param ids
	 */
	public void deleteManyAttrItemByIds(List<Integer> ids ) ;
	/**
	 * 通过多属性项模糊查询属性项
	 * @param params 属性项名--值映射
	 * @param currentPage 
	 * @return
	 */
	public Page querySomeAttrItemByProperties(int currentPage , Map<String , String > params ) ;
	/**
	 * 添加属性项 
	 * @param instance
	 */
	public void addAttrItem(AttrItem instance ) ;
	/**
	 * 更新属性项
	 * @param instance
	 */
	public void updateAttrItem(AttrItem instance ) ;
	/**
	 * 查询某一属性下所有的属性项
	 * @param currentPage 
	 * @param attrId
	 * @return
	 */
	public Page queryAttrItemByAttrId( int currentPage , int attrId ) ;
}
