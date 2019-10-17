package com.dev.constructor;

public class ConstructorExample {
		
	//constructor overloading
	
	
	public ConstructorExample(int i) {
		System.out.println("this const is with int arg");       //parameterized constructor
	}
	
	public ConstructorExample() {
		System.out.println("this is a no-argument constructor");       //no-argument constructor
	}
	
	
	public ConstructorExample(String s) {
		System.out.println("this is constructor with string argument");
	}
	
	public ConstructorExample(String s, int i) {
		System.out.println("this is constructor with string and int  argument");
	}
	
	public ConstructorExample(int i, String s) {
		System.out.println("this is constructor with int and string argument");
	}
	
	

	public static void main(String[] args) {
		
	
		ConstructorExample ce = new ConstructorExample(8);
		ConstructorExample ce1 = new ConstructorExample();
		ConstructorExample ce2 = new ConstructorExample("p");
		ConstructorExample ce3 = new ConstructorExample("p", 25);
		ConstructorExample ce4 = new ConstructorExample(32,"pr");

	}

}
