package com.jimueshop.common;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * @description ִ��һЩ����ת���Ĳ���
 *
 * @author hello world
 *
 * @modifyTime 2015��10��10��
 */
public class Convertor {
	/**
	 * ��list�е�������䵽һ���µ�Set��
	 * 
	 * @param source
	 * @return
	 */
	public static Set ListToSet(List source) {
		Set result = new HashSet();
		for (Object o : source) {
			result.add(o);
		}
		return result;
	}
}
