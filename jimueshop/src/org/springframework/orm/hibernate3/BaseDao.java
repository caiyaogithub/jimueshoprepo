package org.springframework.orm.hibernate3;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.jimueshop.domain.Page;

@SuppressWarnings("rawtypes")
public interface BaseDao<T> {
	HibernateTemplate getHibernateTemplate();
	Serializable save(T instance);
	void delete(T instance);
	/**
	 * HQL�棬ʹ��HQL���޷�����ִ��ɾ��
	 * ������ΪpropertyName��ֵ��value�����е���������
	 * @param propertyName ������
	 * @param value ����ֵ�б�
	 */
	void deleteByPropertyWithHQL(String propertyName , List<?> values ) ;
	/**
	 * ʹ��delete�����棬ʹ��delete��������ִ�м���ɾ��������ִ��Ч��û��ʹ��HQL��Ч�ʸ�
	 * @param propertyName
	 * @param value
	 */
	void deleteByPropertyWithMethod(String propertyName , List<?> values ) ;
	void update(T instance);
	/**
	 * ������������ֵ
	 * @param key ɸѡ������
	 * @param keySet ɸѡ����
	 * @param propertyName �����õ�������
	 * @param value ����ֵ
	 * ���磺 ����ID��Ϊ{1,2,3}��ʵ��status����ֵΪ'����' 
	 * 		updateManyByProperty("id" , new ArrayList<Integer>(Arrays.asList(1,2,3)),"status","����") ; 
	 */
	void updateManyByProperty(String key , List<?> keySet , String propertyName , Object value) ;
	void saveOrUpdate(T instance);
	T findById(Serializable id) ;
	/**
	 * ��ѯid��ids�б��е�����ʵ��
	 * @param ids
	 * @return
	 */
	List<T> findByIds(List<Integer> ids ) ;
	List<T> findAll();
	List<T> findByProperty(String propertyName, Object value);
	/**
	 * ͨ�������� ģ�� ��ѯ���
	 * @param params ���� ��-ֵ ��
	 * @return
	 */
	Page findByProperties(int currentPage , Map<String , String> params ) ;
	/**
	 * ��ѯ������propertyName��values�����е����ж���
	 * @param propertyName
	 * @param values
	 * @return
	 */
	List findByProperties(String propertyName , List<?> values ) ;
	Object uniqueResult(final String hql,final Object... paras);
	List findByHql(String hql,Object... paras);
	Integer executeByHql(final String hql,final Object... paras);
	List findByHqlInCache(final String hql,final Object... paras);
	List findPage(final String hql,final int maxResult,final int firstResult,final Object... paras);
	List findBySQLQuery(final String sql,final Object... paras);
	Page getPageReady(int currentPage,final String hql);
}
