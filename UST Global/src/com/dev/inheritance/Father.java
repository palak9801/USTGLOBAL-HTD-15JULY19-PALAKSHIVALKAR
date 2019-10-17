package com.dev.inheritance;

public class Father extends GrandFather {
	
	static Father f = new Father();
	//String name = "Eddard";                       //2. Eddard Eddard Stark
	 String name = "Eddard";                      //3. Sansa Eddard stark

	public static void main(String[] args) {
	
       f.printName();
	}
	
	@Override
	public void printName()
	{
		 //String name = "Eddard";                             //1.Eddard Torrhen Stark
		 System.out.println(name+" " +super.name+" "+f.lastname);
		 
	}

}
