package com.dev.encapsulation;

public class Finalvar {
	
	final static int A=10;
	
	final static void print()
	{
		System.out.println("final method");
	}
	
	public static void main (String []args)
	{
		//
		//A=11;               A cannot be re-initialized as A is declared as final variable 
		
	}

}
