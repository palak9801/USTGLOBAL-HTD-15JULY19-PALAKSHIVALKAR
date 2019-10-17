package com.dev.inheritance;

public class SuperClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperClass1 sc = new SuperClass1();
		 SuperClass1 sc1 = new SuperClass1(5);
		 SuperClass1 sc2 = new SuperClass1("P");
		 SuperClass1 sc3 = new SuperClass1(3,"R");
		 SuperClass1 sc4 = new SuperClass1("E",2);

	}
	
	public SuperClass1()
	{
		System.out.println("const with no-arg of SuperClass");
	}

	public SuperClass1(int i)
	{
		System.out.println("const with int arg of SuperClass");
	}

	public SuperClass1(String str)
	{
		System.out.println("const with string arg of SuperClass");
	}

	public SuperClass1(String str, int i)
	{
		System.out.println("const with String and int arg of SuperClass");
	}

	public SuperClass1(int i, String str)
	{
		System.out.println("const with int and string arg of SuperClass");
	}


}
