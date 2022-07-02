package com.core.others;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) throws Exception{
		 FileReader fileReader = new FileReader("src/main/java/db.properties");
		 
		 Properties properties = new Properties();
		 properties.load(fileReader);
		 
		 System.out.println(properties.getProperty("user"));
		 System.out.println(properties.getProperty("password"));
		 
		 properties.setProperty("user", "Luthu");
		 properties.setProperty("password", "Test@1234");
		 
		 properties.store(new FileWriter("new.properties"), "Properties Example");
	}
}
