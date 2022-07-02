package com.IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderFileWriter {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("src/com/IO/abc.txt");// read data from source file
		FileWriter fw = new FileWriter("src/com/IO/xyz.txt");// write data to target file
		
		
		int c;
		while ((c = fr.read()) != -1) // read and checking operations
		{
			System.out.print((char) c); // printing data of the file
			fw.write(c); // writing data to target file
		}
		System.out.println("read() & write operatoins are completed");
		
		
		// stream closing operations
		fr.close();
		fw.close();
	}
}
