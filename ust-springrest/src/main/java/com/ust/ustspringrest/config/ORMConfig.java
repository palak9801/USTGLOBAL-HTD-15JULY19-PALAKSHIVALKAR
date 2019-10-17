package com.ust.ustspringrest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class ORMConfig {
	
	@Bean      //spring orm help us to interact spring with jpa hibernate
	public LocalEntityManagerFactoryBean  ormConfiguration() {
		LocalEntityManagerFactoryBean  bean = new LocalEntityManagerFactoryBean();   //to create object of Entitymanagerfactory..we use this class
       bean.setPersistenceUnitName("employee-unit");
       return bean;
	}
	

}
