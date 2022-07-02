package com.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderBufferedWriter {

	static BufferedReader br;
	static BufferedWriter bw;

	public static void main(String[] args) {

		try {
			br = new BufferedReader(new FileReader("src/com/IO/abc.txt"));
			bw = new BufferedWriter(new FileWriter("src/com/IO/xyz.txt"));
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
				bw.write(str);
			}
			br.close();
			bw.close();
		} 
		
		
		catch (Exception e) {
			System.out.println("getting Exception");
		}
	}
}
