package com.jimueshop.common;

import java.util.List;


public class StringUtil {
	public static String concatWithChar(String[] source , String connector ){
		String result = "" ;
		for(String s : source ){
			result += s + connector ;
		}
		return result.substring(0 , result.lastIndexOf(connector)) ;
	}
	public static String concateWithChar(List<String> source , String connector ){
		String result = "" ;
		for(String s : source ){
			result += s + connector ;
		}
		return result.substring(0 , result.lastIndexOf(connector)) ;
	}
	private static class Test {
		public static void main(String[] args) {
			System.out.println(concatWithChar(new String[]{"name like 'zhangsan'","gender like 'ÄÐ'","age like '4'"} , " and ")) ;
		}
	}
}
