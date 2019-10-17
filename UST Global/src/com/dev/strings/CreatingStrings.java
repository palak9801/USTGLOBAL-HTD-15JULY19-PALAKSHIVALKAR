package com.dev.strings;

public class CreatingStrings {

	public static void main(String[] args) {
		
		String str = "Hello";
		
		String stt;                           
		stt="hello";
		
		String strr = new String("hello java");
		
		StringBuffer sb= new StringBuffer("Hello string buffer");      //string buffer
		
		StringBuilder sbu = new StringBuilder("hello string builder");      // string builder	
		
        StringBuffer sb1 = new StringBuffer(2); /*
													 * stringbuffer constructor. when we provide capacity less than 0 it
													 * will give negativearraysizeexception
													 */
		System.out.println(str);
		System.out.println(stt);
	       
		System.out.println(strr);
		
		System.out.println(sb);
		System.out.println(sbu);
		System.out.println(sb1);
		System.out.println("length of the string sb-- "+sb.length());
		System.out.println("capacity of srring sb--"+sb.capacity());
	       
       
		
	}

}
