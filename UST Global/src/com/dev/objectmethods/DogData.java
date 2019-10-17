package com.dev.objectmethods;

import com.dev.encapsulation.Pets;

public class DogData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Dog d= new Dog();
		 
		 d.setAge(1);
		 d.setName("shiro");
		 d.setBreed("doberman");
		 d.setColor("brown");
		 
		 Dog d1 = new Dog();
		 d1.setAge(2);
		 d1.setName("batuk");
		 d1.setBreed("bagel");
		 d1.setColor("brown");
		 
		 Dog d3 = new Dog();
		 d3.setAge(2);
		 d3.setName("moyo");
		 d3.setBreed("shitzu");
		 d3.setColor("brown");
		 
		 Dog d4 = new Dog();
		 d4.setAge(2);
		 d4.setName("moyo");
		 d4.setBreed("shitzu");
		 d4.setColor("brown");
		 
		 
 Dog [] dog = { d, d1, d3};
		 
		 for(int i=0; i<dog.length; i++)
		 {
			
			System.out.println(dog[i].getAge()); System.out.println(dog[i].getBreed());
			System.out.println(dog[i].getColor()); System.out.println(dog[i].getName());
			  System.out.println("****************");
			 
			 //System.out.println(dog[i]);         using the toString method
		 }
		 
		System.out.println(d3.equals(d4));         //for this method we need to override hashcode and equals method in dogdata class
		System.out.println(d3.hashCode());      // as hashcode method is overriden, we are getting same int value for this method
		System.out.println(d4.hashCode());
		 
		
		 
		 
		 
	}

}
