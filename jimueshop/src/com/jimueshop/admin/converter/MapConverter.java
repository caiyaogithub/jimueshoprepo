package com.jimueshop.admin.converter;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

/**
 * 
 * @description 类型自动转换(String ----> Map<String,String>())： 
 * 						"a=1,b=2,c=3" ----> Map<String,String>()[a=1,b=2,c=3]
 *
 * @author hello world
 *
 * @modifyTime 2015年10月1日
 */
public class MapConverter extends DefaultTypeConverter {
	public Object convertValue(Map context, Object value, Class toType) {
		System.out.println("执行MapConverter类型转换器") ;

		if (toType == Map.class) {
			
			Map<String , String> map = new HashMap<String,String>() ;
			
			String[] params = (String[]) value ;
			
			for (String item :  params[0].split(",") ) {
				
				map.put(item.split(":")[0].trim() , item.split(":")[1].trim()) ;
				
			}
			return map ;
			
		} else if (toType == String.class) {
			
			return value.toString() ;
		}
		return null;
	}
}