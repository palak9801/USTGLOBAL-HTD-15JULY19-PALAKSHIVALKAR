package com.dev.methods;

public class MethodExample2 {

	public static void main(String[] args) {
		
		MethodExample me = new MethodExample();      //object created to access method of another class
		int area=MethodExample.calcArea(5);
		System.out.println("Area of Square--"+area);
		
		int area1 = me.areaRec(2, 8);                       //object is used to access non-static method
		System.out.println("area of rectangle--"+area1);
	}

}
