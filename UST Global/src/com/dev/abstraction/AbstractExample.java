package com.dev.abstraction;

public abstract class AbstractExample {   //and if we are having abstract method, the class should be also defined as abstract

	abstract void display()  ;         //abstract method, we cannot have a body to it 
	
	                           //to give implementation to the display method, we need to extend and override the method 
	
	public void show() {
		System.out.println("concrete method of abstract class");         //concrete method
	}
	
	
	public AbstractExample() {      //abstract class constructor can be created
		 System.out.println("constructor of abstract class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
