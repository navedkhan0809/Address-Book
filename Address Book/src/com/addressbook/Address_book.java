package com.addressbook;

import java.io.*;
import java.util.Scanner;

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
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter first name:");  
		String firstname= sc.nextLine();
		
		System.out.print("Enter Last name:");  
		String lastname= sc.nextLine();
		
		System.out.print("Enter Address:");  
		String address= sc.nextLine();
		
		System.out.print("Enter City:");  
		String city= sc.nextLine();
		
		System.out.print("Enter state:");  
		String state= sc.nextLine();
		
		System.out.print("Enter Zip code:");  
		int zip1= sc.nextInt();
		
		System.out.print("Enter Mobile Number:");  
		long number1= sc.nextLong();
		
		String email1="abc0807@gmail.com";
		
		String zip = String.valueOf(zip1);
		String number = String.valueOf(number1);
		String email = String.valueOf(email1);
		info(firstname,lastname,address,city,state,zip,number,email);
		     
	}
}