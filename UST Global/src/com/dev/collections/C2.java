package com.dev.collections;

import java.util.HashMap;

import com.dev.encapsulation.Pets;

public class C2 {

	public static void main(String[] args) {
		HashMap<String, Pets> hm = new HashMap<String,Pets>();
		
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
		
		hm.put("10", p);                 // if p is used for first time its value will be null and if we are updating it then the value will previously assigned value    
		hm.put("2", p1);
		hm.put("7", p2);
		//Pets b = hm.put("10", p3);
		System.out.println(hm);
		
		Pets f = hm.remove("2");
		
		System.out.println(f);
		System.out.println(hm);
		
		
		System.out.println("output of containsKey()--"+hm.containsKey("10"));
		
		System.out.println("output of containsValue()-- "+hm.containsValue(p1));
		
		System.out.println("output for size()--" +hm.size());
		

	}

}
