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
	public static void writeImageToFile(File source, int productId , String uploadImageFileName)
			throws IOException {
		try{
			// �жϴ洢����Ʒ���ļ����Ƿ����
			String savePath = Constraint.SAVE_PATH + "/" + productId ;

			File file = new File(savePath);

			if (!file.exists()) {

				file.mkdir();

			}

			FileUtils.copyFile(source, new File(savePath + "/" + UUID.randomUUID() + uploadImageFileName )) ;
		}catch(Exception e ){e.printStackTrace();}
		

	}
}
