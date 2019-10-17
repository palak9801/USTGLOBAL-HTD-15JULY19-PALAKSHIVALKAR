package com.ustglobal.ustglobalspringcore.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProccesor implements BeanPostProcessor {
	
	
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		
		if(beanName.equals("obj")) {
		System.out.println("Hello before init");
	} else if(beanName.equals("dog")) {
	System.out.println("dog before init");
	}
		return bean;
	}
	
	public  Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		
		System.out.println("Bean name:"+beanName);
       return bean;		
		
	}
	
	
	
}
