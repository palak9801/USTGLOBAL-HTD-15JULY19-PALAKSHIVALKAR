package com.dev.polymorphism;

public class RuntimePoly {
	
	static RuntimePoly rn = new RuntimePoly();

	public static void main(String[] args) {
		 
		
		rn.arith(5, 7);

	}
	
	public int arith(int a, int b)
	{
		int c=a+b;
		System.out.println("Addition of two numbers--"+c);
		return c;
	}

}
