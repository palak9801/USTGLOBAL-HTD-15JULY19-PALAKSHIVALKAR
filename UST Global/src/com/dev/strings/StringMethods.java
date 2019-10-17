package com.dev.strings;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Hello Hello";
		
		//length()
		int l = str.length();
		System.out.println("length of string is--"+l);
		
		//toCharArray()
		char[] ch = str.toCharArray();
		System.out.println("output for toCharArray()--"+ch[0]);
		
		char[] ch1 = str.toCharArray();
		System.out.println("output for toCharArray()--"+ch1[10]);
		
		//charAt(index)
		char i = str.charAt(2);
		System.out.println("output for charAt()--"+i);
		
         //equals()
		String str1 ="hello hello";
		boolean b = str.equals(str1);
		System.out.println("output for equals()--"+b);
		
		//equalsIgnoreCase()                  
		                                //it will compare the string and will ignore the case
		  boolean b1 = str.equalsIgnoreCase(str1) ;
		  System.out.println("output for equalsIgnoreCase()--"+b1);          //it sholud have equal length, length should be same but it is insensitive
		
		  
		  //contains
		  boolean v=str.contains("e");
		  System.out.println("output for contains()--"+v);
		  
		  //replace(oldchar, newchar)
		  
		  String s = str.replace("H", "C");
		  System.out.println("output for replace()--"+s);
		  
		  //indexof
		  
		  int ii = str.indexOf("o");
		  System.out.println("output of indexof()--"+ii);
		  
		  //toUpperCase
		  String up = str.toUpperCase();
		  System.out.println(up);
		  
		  //toLowerCase
		  String lo = up.toLowerCase();
		  System.out.println(lo);
		  
		  //substring(int)
		  String a = str.substring(3);
		  System.out.println("output for substring()--"+a);
		  
		  //substring(start index, end index)
		  String q = str.substring(3, 10);
		  System.out.println("output for substring with two argument--"+q);
		  
		  
	}

}
