package com.dev.methods;

public class MethodExample {
	
	public  static int j;
	
	 static MethodExample me = new MethodExample();        //object to access non-static methods

	public static void main(String[] args) {
		
                     
	int area=calcArea(12);
		System.out.println("Area of Square= "+area);          //int area can be used in both the method as variable defined in a method is accessable to that method only
		
		j=me.areaRec(2,7);
		System.out.println("area of rectangle--"+j);       //static global variable can be used
		
	}

	public static int calcArea(int side)
	{
		int area=side*side; 
		int n= me.areaRec(5,2);
//		System.out.println("area of rectangle--"+n);
		return area;
	}
	
	public int areaRec(int len, int width)
	{                                             //non-static method
		j = len*width;
		return j;                              //static global variable is used
	}
}
