package com.altisource.lrm.vault.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertyFileReader {
	
public static void main(String[] args) {
	new PropertyFileReader().readProperties("rest-client.properties");
}
public static Map<String, String> readProperties(String path)
{
	Properties prop = new Properties();
	InputStream input = null;
	Map<String, String> keyValue = new HashMap<String, String>();
 
	try {
 
		input = new FileInputStream(path);
 
		// load a properties file
		prop.load(input);
		Enumeration<Object> em = prop.keys();
		System.out.println("Properties input:");
		  while(em.hasMoreElements()){
		  String key = (String)em.nextElement();
		  keyValue.put(key, prop.getProperty(key));
		  	System.out.println(key  + ":" + prop.getProperty(key));
		  
		  }
	
 
	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	return keyValue;
 
  }
}
