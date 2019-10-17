package com.dev.polymorphism;

public class CompiletimePoly {
	
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		CompiletimePoly c = new CompiletimePoly();
		c.mul();
		c.mul(34,56);
		c.mul(20,52,84);
		
		
	}
	public int mul() {
		
			System.out.println("Multiplication--");
			return 1;
		}
		
		public int mul(int a, int b)
		{
			System.out.println("Multiplication of 2 digit--"+(a*b));
			return 1;
		}
		
		public int mul(int a, int b, int c)
		{
			System.out.println("Multiplication of 3 digit--"+(a*b*c));
			return 1;
		}
		
		
	}


