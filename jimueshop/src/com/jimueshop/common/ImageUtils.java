package com.jimueshop.common;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;

public class ImageUtils {
	/**
	 * 将上传的图片文件对象写入文件
	 * @param source 图片文件对象
	 * @param productId 商品id，图片文件存储在以商品id为名字的文件夹下
	 * @param uploadImageFileName 上传图片的文件名
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
