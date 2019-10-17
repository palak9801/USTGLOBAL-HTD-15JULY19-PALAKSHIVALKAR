package com.ustglobal.ustglobalspringcore.config;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ustglobal.ustglobalspringcore.beans.Dog;
import com.ustglobal.ustglobalspringcore.beans.HelloWorld;
import com.ustglobal.ustglobalspringcore.beans.Human;

@Configuration
public class BeanConfig {

	
	@Bean(name="obj")//, autowire=Autowire.BY_TYPE)
	public HelloWorld getHelloWorld() {
		
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setMsg("Hello world");
		helloWorld.setCount(100);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 123);
		map.put("xyz", 890);
		helloWorld.setMap(map);
		
		//helloWorld.setAnimal(getDog());
		return helloWorld;    //wiring
	}
	
	
	@Bean(name="dog")
	@Scope("prototype")
	public Dog getDog() {
		
		
		return new  Dog();
		
		
	}
	@Bean(name="human")
	public Human getHuman() {
		
		
		return new Human();
	}
	
	
}
















