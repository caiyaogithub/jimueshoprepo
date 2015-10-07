package com.jimueshop.admin.service.impl;

import java.util.List;
import java.util.Map;

import com.jimueshop.admin.dao.SubTypeDao;
import com.jimueshop.admin.dao.SuperTypeDao;
import com.jimueshop.admin.service.SubTypeService;
import com.jimueshop.domain.Page;
import com.jimueshop.domain.SubType;
import com.jimueshop.domain.SuperType;

public class SubTypeServiceImpl implements SubTypeService {
	
	private SubTypeDao subTypeDao ;
	
	private SuperTypeDao superTypeDao ;

	@Override
	public Page queryAllSubTypeByPage(int currentPage) {
		return subTypeDao.getPageReady(currentPage, "from SubType" ) ;
	}

	@Override
	public void deleteSubTypeById(int subTypeId) {
		SubType subType = querySubTypeById(subTypeId) ;
		subTypeDao.delete(subType) ;
	}

	@Override
	public SubType querySubTypeById(int subTypeId) {
		return subTypeDao.findById(subTypeId) ;
	}
	@Override
	public void deleteManySubTypeByIds(List<Integer> ids) {
		subTypeDao.deleteByProperty("id", ids ) ;
	}
	@Override
	public Page querySomeSubTypeByProperties(int currentPage , Map<String, String> params) {
		return subTypeDao.findByProperties(currentPage, params) ;
	}
	@Override
	public void addSubType(SubType instance) {
		
		SuperType superType = superTypeDao.findById(instance.getSuperType().getId()) ;
		
		superType.getSubTypes().add(instance) ;
		
		//subTypeDao.save(instance) ;
	}
	@Override
	public void updateSubType(SubType instance) {
		
		SubType subType = subTypeDao.findById(instance.getId()) ;
		
		subType.setSubTypeName(instance.getSubTypeName()) ;
		
	}
	@Override
	public boolean checkSubTypeNameExist(String subTypeName) {
		
		if(subTypeDao.findByProperty("subTypeName", subTypeName).size() != 0 ){
			return true ;
		}else{
			return false ;
		}
	}
	@Override
	public Page querySubTypeBySuperTypeId(int currentPage, int superTypeId) {
		
		String hql = String.format( "from SubType where superType.id = '%s' " , superTypeId )  ;
		
		return subTypeDao.getPageReady(currentPage, hql) ;
		
	}
	
	public void setSubTypeDao(SubTypeDao subTypeDao) {
		this.subTypeDao = subTypeDao ;
	}

	public void setSuperTypeDao(SuperTypeDao superTypeDao) {
		this.superTypeDao = superTypeDao;
	}
	
}
