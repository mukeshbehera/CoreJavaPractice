package com.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamBufferedOutputStream {

	static BufferedInputStream bis;
	static BufferedOutputStream bos;

	public static void main(String[] args) {
		try {
			bis = new BufferedInputStream(new FileInputStream("src/com/IO/abc.txt"));
			bos = new BufferedOutputStream(new FileOutputStream("src/com/IO/xyz.txt"));
			int str;
			while ((str = bis.read()) != -1) {
				System.out.println(str);
				bos.write(str);
			}
			bis.close();
			bos.close();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("getting Exception");
		}
	}
}
