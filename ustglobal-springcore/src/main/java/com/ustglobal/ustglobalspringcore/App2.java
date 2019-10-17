package com.ustglobal.ustglobalspringcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.ustglobalspringcore.beans.Author;
import com.ustglobal.ustglobalspringcore.beans.Writer;

public class App2 {
	
	public static void main(String []args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("author.xml");
		Author auth = context.getBean(Author.class);
		System.out.println(auth.getName());
	    auth.getWriter().write();
		
		Author auth2 = context.getBean(Author.class);
		Author auth3 = context.getBean(Author.class);
		Author auth4 = context.getBean(Author.class);
		
		System.out.println(auth==auth2);
		System.out.println(auth3==auth4);  //object created are singleton
		
		//and we we set the scope as "prototype", we will get output as false, objects will not be in the spring container
		
		  Author obj = context.getBean(Author.class);
		    obj.getWriter().write(); 
		    
		
	}

}
