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
	 * HQL版，使用HQL版无法级联执行删除
	 * 参数名为propertyName，值在value集合中的所有数据
	 * @param propertyName 参数名
	 * @param value 参数值列表
	 */
	void deleteByPropertyWithHQL(String propertyName , List<?> values ) ;
	/**
	 * 使用delete方法版，使用delete方法可以执行级联删除，但是执行效率没有使用HQL版效率高
	 * @param propertyName
	 * @param value
	 */
	void deleteByPropertyWithMethod(String propertyName , List<?> values ) ;
	void update(T instance);
	/**
	 * 批量更新属性值
	 * @param key 筛选属性名
	 * @param keySet 筛选集合
	 * @param propertyName 被设置的属性名
	 * @param value 属性值
	 * 例如： 设置ID号为{1,2,3}的实体status属性值为'正常' 
	 * 		updateManyByProperty("id" , new ArrayList<Integer>(Arrays.asList(1,2,3)),"status","正常") ; 
	 */
	void updateManyByProperty(String key , List<?> keySet , String propertyName , Object value) ;
	void saveOrUpdate(T instance);
	T findById(Serializable id) ;
	/**
	 * 查询id在ids列表中的所有实体
	 * @param ids
	 * @return
	 */
	List<T> findByIds(List<Integer> ids ) ;
	List<T> findAll();
	List<T> findByPropertyWithSingleValue(String propertyName, Object value);
	/**
	 * 通过多属性 模糊 查询结果
	 * @param params 属性 名-值 对
	 * @return
	 */
	Page findByProperties(int currentPage , Map<String , String> params ) ;
	/**
	 * 查询单属性propertyName在values集合中的所有对象
	 * @param propertyName
	 * @param values
	 * @return
	 */
	List findByPropertyWithManyValues(String propertyName , List<?> values ) ;
	Object uniqueResult(final String hql,final Object... paras);
	List findByHql(String hql,Object... paras);
	Integer executeByHql(final String hql,final Object... paras);
	List findByHqlInCache(final String hql,final Object... paras);
	List findPage(final String hql,final int maxResult,final int firstResult,final Object... paras);
	List findBySQLQuery(final String sql,final Object... paras);
	Page getPageReady(int currentPage,final String hql);
}
