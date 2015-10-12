package com.jimueshop.admin.service;

import java.util.List;
import java.util.Map;

import com.jimueshop.domain.Ad;
import com.jimueshop.domain.Page;

public interface AdService {
	/**
	 * ��ȡָ��ҳ�����й����Ϣ
	 * @param currentPage ҳ��
	 * @return Page����
	 */
	public Page queryAllAdByPage(int currentPage ) ;
	/**
	 * ���ݹ��IDɾ�����
	 * @param adId
	 */
	public void deleteAdById(int adId ) ;
	/**
	 * ͨ�����ID��ѯ��� 
	 * @param adId
	 * @return
	 */
	public Ad queryAdById(int adId ) ;
	/**
	 * ����ID�б�����ɾ�����
	 * @param ids
	 */
	public void deleteManyAdByIds(List<Integer> ids ) ;
	/**
	 * ͨ��������ģ����ѯ���
	 * @param params ������--ֵӳ��
	 * @param currentPage 
	 * @return
	 */
	public Page querySomeAdByProperties(int currentPage , Map<String , String > params ) ;
	/**
	 * ��ӹ�� 
	 * @param instance
	 */
	public void addAd(Ad instance ) ;
	/**
	 * ���¹��
	 * @param instance
	 */
	public void updateAd(Ad instance ) ;
	/**
	 * ��ѯĳһС�������еĹ��
	 * @param currentPage 
	 * @param superTypeId
	 * @return
	 */
	public Page queryAdBySubTypeId( int currentPage , int subTypeId ) ;
	/**
	 * �������ͼƬ
	 * @param adId ���id
	 * @param newAdPicturePath �µĹ��ͼƬ·��
	 */
	public void changeAdImgPath(int adId , String newAdPicturePath ) ;
}
