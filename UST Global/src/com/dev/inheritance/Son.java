package com.dev.inheritance;

public class Son extends Father {
  
	
	static Son s= new Son();
	 static GrandFather gg = new Father();
	 static GrandFather sss = new Father();
     static Father ss = (Father) new GrandFather();
	
	
	@Override
	public void printName()
	{
		String name = "Robb";
		System.out.println(name+" "+super.name+" "+s.lastname);        //Robb Eddard Stark
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     s.printName();
	}

}
