package com.dev.collections;

import java.util.HashSet;

import com.dev.encapsulation.Pets;

public class C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Pets> hs = new HashSet<Pets>();
		Pets p = new Pets();
		p.setAge(3);
		p.setBreed("shitzu");
		p.setColor("black");
		p.setName("shiro");

		Pets p1 = new Pets();
		p1.setAge(2);
		p1.setBreed("bagel");
		p1.setColor("browm");
		p1.setName("ron");

		Pets p2 = new Pets();
		p2.setAge(3);
		p2.setBreed("pug");
		p2.setColor("browm & black");
		p2.setName("nike");

		Pets p3 = new Pets();
		p3.setAge(4);
		p3.setBreed("german shephard");
		p3.setColor("browm");
		p3.setName("puma");
		
		p.setAge(5);
		p1.setAge(6);
		

		//add method
		boolean b = hs.add(p);
		System.out.println("output of add() of b-- "+b);   
		System.out.println(hs);

		boolean b1 = hs.add(p1);
		System.out.println("output of add() of b1-- "+b1);
		
		for(Pets pp : hs) {          //for each loop
			System.out.println(pp);
		}
		/*
		 * System.out.println(hs);
		 * 
		 * //size method System.out.println("size of HashSet hs--"+hs.size()); //2 hs
		 * 
		 * 
		 * //remove method boolean b2 = hs.remove(p);
		 * System.out.println("output for remove()--"+b2); System.out.println(hs);
		 * 
		 * 
		 * //contains method boolean b3 =hs.contains(p);
		 * System.out.println("output of contains()-- "+b3);
		 * 
		 * //size method System.out.println("size of HashSet hs--"+hs.size()); //1
		 * 
		 * //clear method hs.clear();
		 * System.out.println("size of HashSet after clear()--"+hs.size());
		 * 
		 */
	
	}

}
