package com.jimueshop.admin.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

/**
 * 
 * @description �����Զ�ת��(String ----> List<Integer>())�� 1,2,3,4 ---->
 *              ArrayList<Integer>() [1,2,3,4]
 *
 * @author hello world
 *
 * @modifyTime 2015��10��1��
 */
public class IdListConverter extends DefaultTypeConverter {
	public Object convertValue(Map context, Object value, Class toType) {
		System.out.println("ִ��IdListConverter����ת����") ;

		if (toType == List.class) {
			
			String[] params = (String[]) value ;
			
			List<Integer> idList = new ArrayList<Integer>() ;
			
			String[] userValues = params[0].split(",") ;
			
			for (String item : userValues) {
				
				Integer temp = Integer.parseInt(item.trim()) ;
				
				idList.add(temp) ;
				
			}
			return idList ;
			
		} else if (toType == String.class) {
			
			return value.toString() ;
		}
		return null;
	}
}