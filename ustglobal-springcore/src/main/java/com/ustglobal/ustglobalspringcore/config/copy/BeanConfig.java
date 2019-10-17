package com.ustglobal.ustglobalspringcore.config.copy;

import java.util.HashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ustglobal.ustglobalspringcore.beans.HelloWorld;

@Configuration
public class BeanConfig {

	
	@Bean(name="obj")
	public HelloWorld getHelloWorld() {
		
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setMsg("Hello world");
		helloWorld.setCount(100);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 123);
		map.put("xyz", 890);
		helloWorld.setMap(map);
		return helloWorld;
	}
	
	
}
