package com.dev.assignment;

public class StringReverse {

	public static void main(String[] args) {
	
		String str = "palak";
		
		StringBuilder str1 = new StringBuilder();
		
		for(int i=str.length()-1; i>=0; i--)
		{
			str1.append(str.charAt(i));
		}
		
		System.out.println("reverse string is--");
		System.out.println(str1);
    
		//String str3 = "sukanya"; 
		StringBuilder str2 = new StringBuilder("palak s");
		System.out.println("reverse using reverse method--"+str2.reverse());
		
		
	}

}
