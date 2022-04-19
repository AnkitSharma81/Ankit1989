package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readconfig {
	
	Properties pro;
	
	public Readconfig(){
		File f = new File ("./configuration/objectrepo.properties");
		
		try {
			FileInputStream fis = new FileInputStream(f);
			pro = new Properties();
			pro.load(fis);
		} catch (IOException e) {
			System.out.println("Exception is" + e.getMessage());
	}
	}
   public String getname(){
	   String s = pro.getProperty("username");
	   return s;
   }
   
    public String pass(){
    	String ob = pro.getProperty("password");
    	return ob;
    }
}
