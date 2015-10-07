package com.jimueshop.admin.service.impl;

import java.util.List;
import java.util.Map;

import com.jimueshop.admin.dao.SuperTypeDao;
import com.jimueshop.admin.service.SuperTypeService;
import com.jimueshop.domain.SuperType;
import com.jimueshop.domain.Page;

public class SuperTypeServiceImpl implements SuperTypeService {
	
	private SuperTypeDao superTypeDao ;

	@Override
	public Page queryAllSuperTypeByPage(int currentPage) {
		return superTypeDao.getPageReady(currentPage, "from SuperType" ) ;
	}

	@Override
	public void deleteSuperTypeById(int superTypeId) {
		SuperType superType = querySuperTypeById(superTypeId) ;
		superTypeDao.delete(superType) ;
	}

	@Override
	public SuperType querySuperTypeById(int superTypeId) {
		return superTypeDao.findById(superTypeId) ;
	}
	@Override
	public void deleteManySuperTypeByIds(List<Integer> ids) {
		superTypeDao.deleteByPropertyWithHQL("id", ids ) ;
	}
	@Override
	public Page querySomeSuperTypeByProperties(int currentPage , Map<String, String> params) {
		return superTypeDao.findByProperties(currentPage, params) ;
	}
	@Override
	public void addSuperType(SuperType instance) {
		superTypeDao.save(instance) ;
	}
	@Override
	public void updateSuperType(SuperType instance) {
		superTypeDao.update(instance) ;
	}
	@Override
	public boolean checkSuperTypeNameExist(String superTypeName) {
		
		if(superTypeDao.findByProperty("typeName", superTypeName).size() != 0 ){
			return true ;
		}else{
			return false ;
		}
	}
	public void setSuperTypeDao(SuperTypeDao superTypeDao) {
		this.superTypeDao = superTypeDao ;
	}
	
}
