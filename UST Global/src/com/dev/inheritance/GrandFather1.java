package com.dev.inheritance;

public class GrandFather1 {
	
	 static GrandFather1 gg= new GrandFather1();
	String lastname="Shivalkar";
	String name = "Madhukar";

	public static void main(String[] args) {
		
         gg.printName();
	}
	
	 public void  printName()
	 {
		 System.out.println(name+" "+gg.lastname);
	 }
}
