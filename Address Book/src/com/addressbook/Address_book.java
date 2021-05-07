package com.addressbook;

import java.io.*;

public class Address_book {
	
	public static void info(String a, String b,String c, String d, String e,String f,String g,String h) throws IOException {
		
		FileWriter file = new FileWriter("filename.txt",true);
	      BufferedWriter m = new BufferedWriter(file);
	 
	      m.write(a);
	      m.write(" ");
	      
	      m.write(b);
	      m.write("  ");
	      
	      m.write(c);
	      m.write("  ");
	      
	      m.write(d);
	      m.write("  ");
	      
	      m.write(e);
	      m.write("  ");
	      
	      m.write(f);
	      m.write("  ");
	      
	      m.write(g);
	      m.write("  ");
	      
	      m.write(h);
	      m.write("  ");
	      
	      m.newLine();
	      m.close();
	      file.close();
	      System.out.println("Successfully appended to the file.");		
	}
	
	public static void main(String[] args)throws IOException {
		
		String firstname="Rahul",lastname="kumar",address="abc colony",city="mumbai",state="Maharashtra",zip1="420001",number1="1786798675",email1="Rahul0708@gmail.com";
		
		String zip = String.valueOf(zip1);
		String number = String.valueOf(number1);
		String email = String.valueOf(email1);
		info(firstname,lastname,address,city,state,zip,number,email);
		      
		
	}
}