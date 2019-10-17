package com.ustglobal.ustglobalspringcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.ustglobalspringcore.beans.HelloWorld;
import com.ustglobal.ustglobalspringcore.config.SpringConfig;

public class ComponentApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		HelloWorld obj = context.getBean(HelloWorld.class);
		obj.getAnimal().makeSound();
	}

}
