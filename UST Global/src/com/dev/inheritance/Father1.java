package com.dev.inheritance;

public class Father1 extends GrandFather1{

	
	static Father1 ff= new Father1();
	
	 String name= "Prashant";
	 
	public static void main(String[] args) {
		
		 ff.printName();

	}
	@Override
	public void printName()
	{
		System.out.println(name+" "+super.name+"  "+ff.lastname);
		super.printName();
	}

}



















