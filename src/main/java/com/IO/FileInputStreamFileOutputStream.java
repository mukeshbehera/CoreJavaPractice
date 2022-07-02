package com.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamFileOutputStream {

	public static void main(String[] args) throws IOException {

		// Byte oriented channel
		FileInputStream fis = new FileInputStream("src/com/IO/abc.txt");// read data from source file
		FileOutputStream fos = new FileOutputStream("src/com/IO/xyz.txt");// write data to target file

		int c;
		while ((c = fis.read()) != -1) // read and checking operations
		{
			System.out.print((char) c); // printing data of the file
			fos.write(c); // writing data to target file
		}
		System.out.println("read() & write operatoins are completed");

		// stream closing operations
		fis.close();
		fos.close();
	}
}
