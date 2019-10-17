package com.dev.strings;

public class StringsMethod2 {

	public static void main(String[] args) {

		String str = "WELCOME TO BANGLORE!!!";
		String str1 ="WELCOME TO BANGALORE!!!";

		//length()
		int l = str.length();
		System.out.println("length of string is--"+l);

		//toCharArray()
		char[] ch = str.toCharArray();
		System.out.println("output for toCharArray()--"+ch[6]);


		//charAt(index)
		char i = str.charAt(8);
		System.out.println("output for charAt()--"+i);

		//equals()
		
		boolean b = str.equals(str1);
		System.out.println("output for equals()--"+b);

		//equalsIgnoreCase() 
		boolean b1 = str.equalsIgnoreCase(str1) ;
		System.out.println("output for equalsIgnoreCase()--"+b1);

	}

}
