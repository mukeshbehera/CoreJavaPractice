package com.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedReaderPrintWriter {

	static BufferedReader br;
	static PrintWriter pw;

	public static void main(String[] args) {
		try {
			br = new BufferedReader(new FileReader("src/com/IO/abc.txt"));
			pw = new PrintWriter(new FileWriter("src/com/IO/xyz.txt"));
			String line;
			while ((line = br.readLine()) != null) // reading & checking
			{
				System.out.println(line); // printing data of file
				pw.println(line); // writing data to target file
			}
			// close the streams
			br.close();
			pw.close();
		}

		
		catch (IOException io) {
			System.out.println("getting IOException");
		}
	}
}
