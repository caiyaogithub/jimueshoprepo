package com.jimueshop.admin.service;

import java.util.List;
import java.util.Map;

import com.jimueshop.domain.SubType;
import com.jimueshop.domain.Page;

public interface SubTypeService {
	/**
	 * 获取指定页的所有小类信息
	 * @param currentPage 页数
	 * @return Page对象
	 */
	public Page queryAllSubTypeByPage(int currentPage ) ;
	/**
	 * 根据小类ID删除小类
	 * @param subTypeId
	 */
	public void deleteSubTypeById(int subTypeId ) ;
	/**
	 * 通过小类ID查询小类 
	 * @param subTypeId
	 * @return
	 */
	public SubType querySubTypeById(int subTypeId ) ;
	/**
	 * 根据ID列表批量删除小类
	 * @param ids
	 */
	public void deleteManySubTypeByIds(List<Integer> ids ) ;
	/**
	 * 通过多属性模糊查询小类
	 * @param params 属性名--值映射
	 * @param currentPage 
	 * @return
	 */
	public Page querySomeSubTypeByProperties(int currentPage , Map<String , String > params ) ;
	/**
	 * 添加小类 
	 * @param instance
	 */
	public void addSubType(SubType instance ) ;
	/**
	 * 更新小类
	 * @param instance
	 */
	public void updateSubType(SubType instance ) ;
	/**
	 * 检查小类名数据库中是否已经存在
	 * @param subTypeName
	 * @return
	 */
	public boolean checkSubTypeNameExist(String subTypeName ) ;
	/**
	 * 查询某一大类下所有的小类
	 * @param currentPage 
	 * @param superTypeId
	 * @return
	 */
	public Page querySubTypeBySuperTypeId( int currentPage , int superTypeId ) ;
}
