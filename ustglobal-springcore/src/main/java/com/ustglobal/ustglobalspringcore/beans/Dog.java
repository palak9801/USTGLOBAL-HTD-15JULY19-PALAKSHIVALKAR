package com.ustglobal.ustglobalspringcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;


@Component("dog")
public class Dog implements Animal {
	
	
	@PostConstruct
	public  void init() {
		
		System.out.println("dog init method");
	}
	@PreDestroy
	public void destroy() {
		
		System.out.println("dog destroy method");
	}
	
	public Dog() {
		
		System.out.println("Dog object created");
	}

	@Override
	public void makeSound() {
		System.out.println("Baoooooooo");
		
		
	}
    
}
