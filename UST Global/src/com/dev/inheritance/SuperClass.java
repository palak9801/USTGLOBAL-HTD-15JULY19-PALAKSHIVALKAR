package com.dev.inheritance;

public class SuperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		 SuperClass sc = new SuperClass();
		 SuperClass sc1 = new SuperClass(5);
		 SuperClass sc2 = new SuperClass("P");
		 SuperClass sc3 = new SuperClass(3,"R");
		 SuperClass sc4 = new SuperClass("E",2);
		 
	}
	
	public SuperClass()
	{
		System.out.println("const with no-arg of SuperClass");
	}

	public SuperClass(int i)
	{
		System.out.println("const with int arg of SuperClass");
	}

	public SuperClass(String str)
	{
		System.out.println("const with string arg of SuperClass");
	}

	public SuperClass(String str, int i)
	{
		System.out.println("const with String and int arg of SuperClass");
	}

	public SuperClass(int i, String str)
	{
		System.out.println("const with int and string arg of SuperClass");
	}

}
