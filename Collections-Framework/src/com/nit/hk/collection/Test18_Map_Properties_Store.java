package com.nit.hk.collection;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Test18_Map_Properties_Store {

	public static void main(String[] args) throws IOException {

		Properties p = new Properties();
		
		p.setProperty("SNO", "101");
		p.setProperty("SNAME", "HK");
		p.setProperty("COURSE", "CJ");
		p.setProperty("FEE", "3500");
		
		System.out.println(p);
		
		p.store(new FileWriter("student.properties"),  "student details");
		System.out.println("properties are saved");
	}

}
