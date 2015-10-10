package com.jimueshop.common;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * @description 执行一些类型转换的操作
 *
 * @author hello world
 *
 * @modifyTime 2015年10月10日
 */
public class Convertor {
	/**
	 * 将list中的数据填充到一个新的Set中
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
