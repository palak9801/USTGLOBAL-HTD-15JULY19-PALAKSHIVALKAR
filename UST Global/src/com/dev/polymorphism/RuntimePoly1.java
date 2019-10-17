package com.dev.polymorphism;

public class RuntimePoly1 extends RuntimePoly {
	
	 static RuntimePoly1 rnn = new RuntimePoly1();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         rnn.arith(80,20);
	}
	
	@Override
	public int arith(int a, int b)
	{    super.arith(10, 20);
		int res= a-b;
		System.out.println("Subtraction--"+res);
		return res;
	}

}
