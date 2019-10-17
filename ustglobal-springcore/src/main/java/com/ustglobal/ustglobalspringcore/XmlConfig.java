package com.ustglobal.ustglobalspringcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.ustglobalspringcore.beans.Animal;
import com.ustglobal.ustglobalspringcore.beans.Author;
import com.ustglobal.ustglobalspringcore.beans.HelloWorld;
import com.ustglobal.ustglobalspringcore.beans.Pet;

public class XmlConfig 
{
    public static void main( String[] args )
    {
    	
    	HelloWorld obj1 = new HelloWorld();
    	obj1.setMsg("Helloo World !!");
    	System.out.println(obj1.getMsg());
    	
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	HelloWorld  obj2 = context.getBean(HelloWorld.class);
    	System.out.println(obj2.getMsg());
    	System.out.println(obj2.getCount());
    	
    	
    	//obj2.getAnimal().makeSound();   //wiring    //3.
    	
    	
    	System.out.println(obj2.getMap());   //wiring map
    	
    
    
		/*
		 * Animal animal = context.getBean(Animal.class); animal.makeSound();
		 */
    
    Animal animal = (Animal) context.getBean("dog");
    animal.makeSound();
    
    System.out.println("**************************");  
    //wiring through constructor
    Pet pet = context.getBean(Pet.class);
    System.out.println(pet.getName());
    pet.getAnimal().makeSound();
    
  
    
    
    context.close();
    
    
   
   
    
    }
    
    
}
