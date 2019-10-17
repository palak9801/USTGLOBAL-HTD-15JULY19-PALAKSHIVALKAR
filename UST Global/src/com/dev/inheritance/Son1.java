package com.dev.inheritance;

public class Son1 extends Father1 {

	static Son1 ss= new Son1();
	String name ="Pushkar";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 ss.printName();
	}
	@Override
	public void printName()
	{
		String name = "Pushkar";
		System.out.println(name+" "+super.name+" "+ss.lastname);        
		super.printName();
	}

}
