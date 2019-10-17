package com.dev.methods;

public class ArithOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithOperation ao = new ArithOperation();
		int number=1;
		switch(number)
		{
		case 1: System.out.println("-------Operation for 2 input------");
			    ao.add(5,3);
		        ao.subtr(3,2);
		        ao.mul(2.14, 5);
		        ao.div(8, 4);
		        break;
		case 2: System.out.println("-------Operation for 3 input------");
			    ao.add(10, 50, 10);
		        ao.subtr(90, 20,2);
		        ao.mul(2.214, 1.2547,1.2365);
		        ao.div(2, 1, 2.35);
		        break;
		case 3: System.out.println("-------Operation for 4 input------"); 
			     ao.add(12,  2.451, 5, 3.2547);
		         ao.subtr(12, 21, 1.022, 1.254);
		         ao.mul(1.2587,  5, 2.3647, 6);
		         ao.div(20, 10,0,2);
		         
		
		}
		}
	
   //Addition
	public int add(int a, int b)
	{
		System.out.println("Addition --"+(a+b));
		return 1;
	}


	public int add(int a, int b, int c)
	{
		System.out.println("Addition --"+(a+b));
		return 1;
	}
	public void add(int a, double b, int c, double d)
	{
		System.out.println("Addition --"+(a+b));

	}
	
	
	//Subtraction
	public int subtr(int a, int b)
	{
		System.out.println("Subtraction --"+(a-b));
		return 1;
	}
	public int subtr(int a, int b, int c)
	{
		System.out.println("Subtraction --"+(a-b-c));
		return 1;
	}
	public double subtr(int a, int b, double c, double d)
	{
		System.out.println("Subtraction --"+(a-b-c-d));
		return 1;
	}
	
	
	
	//Multiplication
	public double mul(double a, int b)
	{
		System.out.println("Multiplication --"+(a*b));
		return 1;
	}
	public double mul(double a, double b, double c)
	{
		System.out.println("Multiplication --"+(a*b*c));
		return 1;
	}
	public double mul(double a, int b, double c, int d)
	{
		System.out.println("Multiplication --"+(a*b*c*d));
		return 1;
	}
	
	//Division
	
	public int div(int a, int b)
	{
		System.out.println("Division --"+(a/b));
		return 1;
	}
	public int div(int a, int b, double c)
	{
		System.out.println("Division --"+((a/b)/c));
		return 1;
	}
	public int div(int a, int b, int c, int d)
	{
		System.out.println("Division --"+((a+b)/(c+d)));
		return 1;
	}
	

}
