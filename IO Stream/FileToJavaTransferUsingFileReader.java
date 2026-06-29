package com.io_streams;

import java.io.FileReader;

public class FileToJavaTransferUsingFileReader {

	public static void main(String[] args) {
		String path = "D:\\welcome.txt";
		FileReader fr = null;
		try {
			fr = new FileReader(path);
			int temp = 0;
			String str = "";
			while ((temp = fr.read()) != -1) {
				str = str + (char) temp;
			}
			System.out.println("Reading data from file");
			Thread.sleep(3000);
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
