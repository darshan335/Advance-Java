package com.io_streams;

import java.io.FileOutputStream;

public class JavaToFileTransfer {

	public static void main(String[] args) throws Exception {
		String path = "D:\\Advance Java\\Advance_Java\\src\\com\\io_streams\\Destination.txt";
		FileOutputStream fos = new FileOutputStream(path);
		String str = "Hi Everyone Welcome to Advance Java Classes";
		byte[] b = str.getBytes();
		fos.write(b);
		System.out.println("Data Transfered Successfully");
		fos.close();

	}

}
