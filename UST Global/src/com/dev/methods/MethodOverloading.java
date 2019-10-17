package com.dev.methods;

public class MethodOverloading {
	
	static MethodOverloading m = new MethodOverloading();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m.print();
		m.print(2);
		print("e");
		
		

	}
	
	
	 static public void print() {
		System.out.println("print method with no-argument");
	}
	
	 final public int print(int i) {
		System.out.println("print method with int-argument");
		return 1;
	}
	
	static  String print(String str) {
		System.out.println("print method with string-argument");
		return "a";
	}
	

}
