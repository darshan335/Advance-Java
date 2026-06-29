package com.io_streams;

import java.io.FileInputStream;

public class FileToJavaTransfer {

	public static void main(String[] args) {
		String path = "D:\\Advance Java\\Advance_Java\\src\\com\\io_streams\\Destination.txt";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(path);
			byte[] b = new byte[fis.available()];
			fis.read(b);
			String str = new String(b);
			System.out.println(str);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
