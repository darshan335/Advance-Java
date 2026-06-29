package com.io_streams;

import java.io.FileInputStream;

public class FileToJavaTransferUsingTryWithResources {

	public static void main(String[] args) {
		String path = "D:\\destination.txt";
		try (FileInputStream fis = new FileInputStream(path);) {
			byte[] b = new byte[fis.available()];
			fis.read(b);
			String str = new String(b);
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
