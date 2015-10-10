package com.jimueshop.common;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;

public class ImageUtils {
	/**
	 * ���ϴ���ͼƬ�ļ�����д���ļ�
	 * @param source ͼƬ�ļ�����
	 * @param productId ��Ʒid��ͼƬ�ļ��洢������ƷidΪ���ֵ��ļ�����
	 * @param uploadImageFileName �ϴ�ͼƬ���ļ���
	 * @throws IOException
	 */
	public static void writeImageToFile(File source, String savePath )
			throws IOException {
		
		String parentFolder = savePath.substring(0,savePath.lastIndexOf("/")) + "/" ;
		
		File parentFolderFile = new File(parentFolder) ;
		
		if(!parentFolderFile.exists()){
			
			parentFolderFile.mkdir() ;
			
		}
		
		FileUtils.copyFile(source, new File(savePath)) ;
		
	}
}
