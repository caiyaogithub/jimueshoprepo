package com.jimueshop.admin.service;

import java.util.List;
import java.util.Map;

import com.jimueshop.domain.OrderItem;
import com.jimueshop.domain.Page;

public interface OrderItemService {
	/**
	 * ��ȡָ��ҳ�����ж�����Ϣ
	 * @param currentPage ҳ��
	 * @return Page����
	 */
	public Page queryAllOrderItemByPage(int currentPage ) ;
	/**
	 * ���ݶ���IDɾ������
	 * @param orderItemId
	 */
	public void deleteOrderItemById(int orderItemId ) ;
	/**
	 * ͨ������ID��ѯ���� 
	 * @param orderItemId
	 * @return
	 */
	public OrderItem queryOrderItemById(int orderItemId ) ;
	/**
	 * ����ID�б�����ɾ������
	 * @param ids
	 */
	public void deleteManyOrderItemByIds(List<Integer> ids ) ;
	/**
	 * ͨ��������ģ����ѯ����
	 * @param params ������--ֵӳ��
	 * @param currentPage 
	 * @return
	 */
	public Page querySomeOrderItemByProperties(int currentPage , Map<String , String > params ) ;
	/**
	 * �鿴idList�еĶ���״̬�ǲ���status
	 * @param idList ����id�б�
	 * @param status ����״̬ �ѷ��� ����� ����״̬���е�һ�� 
	 * @return
	 */
	public boolean checkOrderItemStatus(List<Integer> idList , String status ) ;
	/**
	 * �ı䶩��״̬
	 * @param idList �����б�
	 * @param status ����״̬
	 */
	public void changeOrderItemSatus(List<Integer> idList , String status ) ;
}
