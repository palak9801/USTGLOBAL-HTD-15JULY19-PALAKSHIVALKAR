  package com.dev.abstraction;

public class Abstraction  extends AbstractExample{
	
//	AbstractExample a = new AbstractExample();        //we cannot created object of a abstract class
	

	  public Abstraction() {
		  System.out.println("const of abstraction class");
	  }
	  
	  
	  
	  
	  @Override
		void display() {             //implementation of abstract method
			
			System.out.println("this is the implemented abstract method");
			
		}
	  
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Abstraction a = new Abstraction();
        a.display();
        a.show();
	}

	

}
