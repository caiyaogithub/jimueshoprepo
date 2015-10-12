package com.jimueshop.admin.service.impl;

import java.util.List;
import java.util.Map;

import com.jimueshop.admin.dao.AttrDao;
import com.jimueshop.admin.dao.SubTypeDao;
import com.jimueshop.admin.service.AttrService;
import com.jimueshop.domain.Attr;
import com.jimueshop.domain.Page;
import com.jimueshop.domain.SubType;

public class AttrServiceImpl implements AttrService {
	
	private AttrDao attrDao ;
	
	private SubTypeDao subTypeDao ;

	@Override
	public Page queryAllAttrByPage(int currentPage) {
		return attrDao.getPageReady(currentPage, "from Attr" ) ;
	}

	@Override
	public void deleteAttrById(int attrId) {
		Attr attr = queryAttrById(attrId) ;
		attrDao.delete(attr) ;
	}

	@Override
	public Attr queryAttrById(int attrId) {
		return attrDao.findById(attrId) ;
	}
	@Override
	public void deleteManyAttrByIds(List<Integer> ids) {
		attrDao.deleteByPropertyWithMethod("id", ids ) ;
	}
	@Override
	public Page querySomeAttrByProperties(int currentPage , Map<String, String> params) {
		return attrDao.findByProperties(currentPage, params) ;
	}
	@Override
	public void addAttr(Attr instance) {
		
		SubType subType = subTypeDao.findById(instance.getSubType().getId()) ;
		
		subType.getAttrs().add(instance) ;
		
		//attrDao.save(instance) ;
	}
	@Override
	public void updateAttr(Attr instance) {
		// 如果属性值没有变化则不会生成update语句
		Attr attr = attrDao.findById(instance.getId()) ;
		
		attr.setAttrName(instance.getAttrName()) ;
		
		attr.setAttrDesc(instance.getAttrDesc()) ;
	}
	@Override
	public boolean checkAttrNameExist(String attrName) {
		
		if(attrDao.findByPropertyWithSingleValue("attrName", attrName).size() != 0 ){
			return true ;
		}else{
			return false ;
		}
	}
	@Override
	public Page queryAttrBySubTypeId(int currentPage, int subTypeId) {
		
		String hql = String.format( "from Attr where subType.id = '%s' " , subTypeId )  ;
		
		return attrDao.getPageReady(currentPage, hql) ;
		
	}
	
	public void setAttrDao(AttrDao attrDao) {
		this.attrDao = attrDao ;
	}

	public void setSubTypeDao(SubTypeDao subTypeDao) {
		this.subTypeDao = subTypeDao ;
	}
}
