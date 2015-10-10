package com.jimueshop.common ;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {
	/**
	 * ��ȡ��ǰ���ڼ�ʱ��
	 * @return ʱ���ʽ yyyy-MM-dd HH:mm:ss
	 */
	public static String getCurrentTime(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return df.format(new Date());
	}
	
	/**
	 * ��ȡ��ǰ����
	 * @return ���ڸ�ʽ yyyy-MM-dd
	 */
	public static String getCurrentDate(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.format(new Date());
	}
}