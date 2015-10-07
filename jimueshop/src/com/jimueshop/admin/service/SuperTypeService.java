package com.jimueshop.admin.service;

import java.util.List;
import java.util.Map;

import com.jimueshop.domain.SuperType;
import com.jimueshop.domain.Page;

public interface SuperTypeService {
	/**
	 * 获取指定页的所有大类信息
	 * @param currentPage 页数
	 * @return Page对象
	 */
	public Page queryAllSuperTypeByPage(int currentPage ) ;
	/**
	 * 根据大类ID删除大类
	 * @param superTypeId
	 */
	public void deleteSuperTypeById(int superTypeId ) ;
	/**
	 * 通过大类ID查询大类 
	 * @param superTypeId
	 * @return
	 */
	public SuperType querySuperTypeById(int superTypeId ) ;
	/**
	 * 根据ID列表批量删除大类
	 * @param ids
	 */
	public void deleteManySuperTypeByIds(List<Integer> ids ) ;
	/**
	 * 通过多属性模糊查询大类
	 * @param params 属性名--值映射
	 * @param currentPage 
	 * @return
	 */
	public Page querySomeSuperTypeByProperties(int currentPage , Map<String , String > params ) ;
	/**
	 * 添加大类 
	 * @param instance
	 */
	public void addSuperType(SuperType instance ) ;
	/**
	 * 更新大类
	 * @param instance
	 */
	public void updateSuperType(SuperType instance ) ;
	/**
	 * 检查大类名数据库中是否已经存在
	 * @param superTypeName
	 * @return
	 */
	public boolean checkSuperTypeNameExist(String superTypeName ) ;
}
