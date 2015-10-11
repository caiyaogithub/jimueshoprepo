package com.jimueshop.test;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String x = "1,2," ;
		String[] xy = x.split(",") ;
		System.out.println(Arrays.toString(xy));
	}
}
