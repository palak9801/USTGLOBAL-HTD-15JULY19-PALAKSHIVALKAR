package com.dev.inheritance;

public class GrandFather {
	
	 static  GrandFather g = new GrandFather();
	 
	
	String lastname="Stark";
	String name = "Torrhen";          //1.

	public static void main(String[] args) {
       
		 g.printName();

	}
	
	public void printName()
	{
		//String name = "Torrhen";              //2.
		System.out.println(name+ " " + g.lastname);
	}

}
