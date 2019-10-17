package com.dev.encapsulation;

public class PetData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		
		 Pets p = new Pets();
		 Pets p1 = new Pets();
		 Pets p2 = new Pets();
		 
		 
		 
		 p.setType("Dog");
		 p.setAge(2);
		 p.setBreed("beagel");
		 p.setColor("brown");
		 p.setName("batuk");
		 
		 
		 p1.setType("Cat");
		 p1.setAge(2);
		 p1.setBreed("persian");
		 p1.setColor("white");
		 p1.setName("billi");
		 
		 
		 p2.setType("Tortoise");
		 p2.setAge(2);
		 p2.setBreed("Singapore Tortoise");
		 p2.setColor("green-black");
		 p2.setName("chinu");
		 
		 
		 
		 Pets[] pet = { p, p1, p2};
		 
		 for(int i=0; i<pet.length; i++)
		 {
			 System.out.println(pet[i].getType());
			 System.out.println(pet[i].getAge());
			 System.out.println(pet[i].getBreed());
			 System.out.println(pet[i].getColor());
			 System.out.println(pet[i].getName());
			 System.out.println("****************");
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
