package com.dev.collections;

import java.util.ArrayList;

public class C4 {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> ar = new ArrayList<Employee>(2);
		Employee e = new Employee();
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e.setName("Palak S");
		e.setId(1100);
		e.setEmail("palak@gmail.com");
		e.setPassword("********");
		
		e1.setName("Jenivia L");
		e1.setId(2200);
		e1.setEmail("jenny@gmail.com");
		e1.setPassword("********");
		
		e2.setName("Sukanya H");
		e2.setId(3300);
		e2.setEmail("sukanya@gmail.com");
		e2.setPassword("palak");
		
		//set()
		e.setEmail("palak123@gmail.com");
		e1.setEmail("jenny123@gmail.com");
		e2.setEmail("sukanya123@gmail.com");
		
		
		
		
		//add()
		 ar.add(e);
		ar.add(e1);
		//ar.add(e2);
		System.out.println(ar);
		
		ar.trimToSize();
		
		System.out.println("after trim-- "+ar.size());
		
		
		
		
	}

}
