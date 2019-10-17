package com.dev.abstraction;

public interface Abs {
	public void display();
	
	public static void  print() {                  //we can create concrete methods in interface using keyword static or default only.
		                                          //if not using static or default, it will consider it as abstract method and as abstract method do not have body, it will give error
		System.out.println("A");
		

	}

}
