package com.jimueshop.admin.service.impl;

import java.util.List;
import java.util.Map;

import com.jimueshop.admin.dao.AttrDao;
import com.jimueshop.admin.dao.AttrItemDao;
import com.jimueshop.admin.service.AttrItemService;
import com.jimueshop.domain.Attr;
import com.jimueshop.domain.AttrItem;
import com.jimueshop.domain.Page;

public class AttrItemServiceImpl implements AttrItemService {
	
	private AttrItemDao attrItemDao ;
	
	private AttrDao attrDao ;

	@Override
	public Page queryAllAttrItemByPage(int currentPage) {
		return attrItemDao.getPageReady(currentPage, "from AttrItem" ) ;
	}

	@Override
	public void deleteAttrItemById(int attrItemId) {
		AttrItem attrItem = queryAttrItemById(attrItemId) ;
		attrItemDao.delete(attrItem) ;
	}

	@Override
	public AttrItem queryAttrItemById(int attrItemId) {
		return attrItemDao.findById(attrItemId) ;
	}
	@Override
	public void deleteManyAttrItemByIds(List<Integer> ids) {
		attrItemDao.deleteByPropertyWithHQL("id", ids ) ;
	}
	@Override
	public Page querySomeAttrItemByProperties(int currentPage , Map<String, String> params) {
		return attrItemDao.findByProperties(currentPage, params) ;
	}
	@Override
	public void addAttrItem(AttrItem instance) {
		
		Attr attr = attrDao.findById(instance.getAttr().getId()) ;
		
		attr.getAttrItems().add(instance) ;
		
		//attrItemDao.save(instance) ;
	}
	@Override
	public void updateAttrItem(AttrItem instance) {
		// 如果属性值没有变化则不会生成update语句
		AttrItem attrItem = attrItemDao.findById(instance.getId()) ;
		
		attrItem.setValue(instance.getValue()) ;
		
	}
	@Override
	public Page queryAttrItemByAttrId(int currentPage, int attrId) {
		
		String hql = String.format( "from AttrItem where attr.id = '%s' " , attrId )  ;
		
		return attrItemDao.getPageReady(currentPage, hql) ;
		
	}
	
	public void setAttrItemDao(AttrItemDao attrItemDao) {
		this.attrItemDao = attrItemDao ;
	}

	public void setAttrDao(AttrDao attrDao) {
		this.attrDao = attrDao ;
	}
}
