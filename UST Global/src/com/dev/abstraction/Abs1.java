package com.dev.abstraction;

public class Abs1 implements Abs {

	public static void main(String[] args) {
		Abs.print();
		Abs1 ee= new Abs1();
		ee.display();

	}

	@Override
	public void display() {
		System.out.println("display method of interface");
		
	}

}
