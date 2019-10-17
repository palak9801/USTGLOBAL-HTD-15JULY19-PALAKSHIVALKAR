package com.dev.inheritance;

public class SubClass1 extends SuperClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubClass1 sbb = new SubClass1();
		SubClass1 sbb1 = new SubClass1(8);
		SubClass1 sbb2 = new SubClass1("p");
		SubClass1 sbb3 = new SubClass1("t",8);
		SubClass1 sbb4 = new SubClass1(7,"y");
		
		
	}
	
	
	public SubClass1()
	{
		super();
	}

	public SubClass1(int i)
	{
		super(5);
	}

	public SubClass1(String str)
	{
		super("e");
	}

	public SubClass1(String str, int i)
	{
		super("r",3);
	}

	public SubClass1(int i, String str)
	{
		super("r",7);
	}


	
	

}
