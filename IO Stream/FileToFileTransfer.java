package com.io_streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileToFileTransfer {

	public static void main(String[] args) {
		String path1 = "D:\\welcome.txt";
		String path2 = "D:\\destination.txt";
		try (FileInputStream fis = new FileInputStream(path1); FileOutputStream fos = new FileOutputStream(path2);) {
			byte[] b = new byte[fis.available()];
			fis.read(b);
			fos.write(b);
			System.out.println("File to file data transfered successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
