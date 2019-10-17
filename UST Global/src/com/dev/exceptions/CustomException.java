package com.dev.exceptions;

public class CustomException extends Exception {

	  public CustomException() {
		  System.out.println("Custom Exception");
	  }
	  
	  public CustomException(int i) {
		  System.out.println("Custom Exception for integer");
	  }
	  
	  public CustomException(String s) {
		  System.out.println("Custom Exception for string");
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
