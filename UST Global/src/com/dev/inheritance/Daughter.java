package com.dev.inheritance;

public class Daughter extends Father {
	
	static Daughter d= new Daughter();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		d.printName();
	

	}
	@Override
	public void printName()
	{
		String name="Sansa";
		System.out.println(name+" "+super.name+" "+d.lastname);
	}

}
