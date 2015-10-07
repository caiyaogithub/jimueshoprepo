package com.jimueshop.admin.service;

import java.util.List;
import java.util.Map;

import com.jimueshop.domain.Attr;
import com.jimueshop.domain.Page;

public interface AttrService {
	/**
	 * 获取指定页的所有属性信息
	 * @param currentPage 页数
	 * @return Page对象
	 */
	public Page queryAllAttrByPage(int currentPage ) ;
	/**
	 * 根据属性ID删除属性
	 * @param attrId
	 */
	public void deleteAttrById(int attrId ) ;
	/**
	 * 通过属性ID查询属性 
	 * @param attrId
	 * @return
	 */
	public Attr queryAttrById(int attrId ) ;
	/**
	 * 根据ID列表批量删除属性
	 * @param ids
	 */
	public void deleteManyAttrByIds(List<Integer> ids ) ;
	/**
	 * 通过多属性模糊查询属性
	 * @param params 属性名--值映射
	 * @param currentPage 
	 * @return
	 */
	public Page querySomeAttrByProperties(int currentPage , Map<String , String > params ) ;
	/**
	 * 添加属性 
	 * @param instance
	 */
	public void addAttr(Attr instance ) ;
	/**
	 * 更新属性
	 * @param instance
	 */
	public void updateAttr(Attr instance ) ;
	/**
	 * 检查属性名数据库中是否已经存在
	 * @param attrName
	 * @return
	 */
	public boolean checkAttrNameExist(String attrName ) ;
	/**
	 * 查询某一小类下所有的属性
	 * @param currentPage 
	 * @param subTypeId
	 * @return
	 */
	public Page queryAttrBySubTypeId( int currentPage , int subTypeId ) ;
}
