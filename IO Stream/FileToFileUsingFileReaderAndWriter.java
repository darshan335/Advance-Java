package com.io_streams;

import java.io.FileReader;
import java.io.FileWriter;

public class FileToFileUsingFileReaderAndWriter {

	public static void main(String[] args) {
		String path1 = "D:\\welcome.txt";
		String path2 = "D:\\destination.txt";
		try (FileReader fr = new FileReader(path1); FileWriter fw = new FileWriter(path2);) {
			int temp=0;
			String str="";
			while((temp=fr.read())!=-1) {
				str=str+(char)(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
