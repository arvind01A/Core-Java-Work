package com.nit.hk.collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test19_Map_Properties_Load {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Properties p1 = new Properties();
		p1.load(new FileReader("student.properties"));
		
		int sno = Integer.parseInt(p1.getProperty("SNO"));
		String name = p1.getProperty("SNAME");
		String course = p1.getProperty("COURSE");
		double fee = Double.parseDouble(p1.getProperty("FEE"));
		
		System.out.println(sno);
		System.out.println(name);
		System.out.println(course);
		System.out.println(fee);

	}

}
