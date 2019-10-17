package com.dev.constructor;

public class AreaConstructor {
	
	
	
	
	public  AreaConstructor ()
	{
		System.out.println("AREA OF DIFFERNT SHAPES--");
	} 
	
	public AreaConstructor (int side)
	{
		System.out.println("Area of Square--"+(side*side));
	}
	
	public AreaConstructor (float r)
	{
		System.out.println("Area of circle--"+(2*3.14*r));
	}
	
	public AreaConstructor (int l, int width)
	{
		System.out.println("Area of Rectangle--"+(l*width));
	}
	
	public AreaConstructor (double a)
	{
		System.out.println("Area of cube--"+(a*a*a));
	}
	
	

	public static void main(String[] args) {
		
		AreaConstructor ac = new AreaConstructor();
		AreaConstructor ac1 = new AreaConstructor(5);
		AreaConstructor ac2 = new AreaConstructor(1.2547f);
		AreaConstructor ac3 = new AreaConstructor(5,9);
		AreaConstructor ac4 = new AreaConstructor(1.25478555);
		
		System.out.println(ac1);
		

	}

}
