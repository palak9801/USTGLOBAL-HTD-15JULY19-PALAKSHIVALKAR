package com.ustglobal.ustglobalspringcore.beans;

import org.springframework.stereotype.Component;

@Component("human")
public class Human implements Animal {

	@Override
	public void makeSound() {
		System.out.println("Bla bla bala bla ......");
		
	}

}
