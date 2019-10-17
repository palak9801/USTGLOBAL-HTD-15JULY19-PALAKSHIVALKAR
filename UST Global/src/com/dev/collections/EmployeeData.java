package com.dev.collections;

import java.util.HashSet;

public class EmployeeData {

	public static void main(String[] args) {
		HashSet<Employee> hs = new HashSet<Employee>();
		
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
		boolean b = hs.add(e);
		boolean b1 = hs.add(e1);
		boolean b2 = hs.add(e2);
		System.out.println("HashSet hs contain--"+hs);
		
		
		//size()
		System.out.println("Size of HashSet hs-- "+hs.size());
		
		
		//contains()
		System.out.println("Do HashSet contain e2?--"+hs.contains(e2));
		
		//remove()
		System.out.println("Remove(e)--"+hs.remove(e));
		
	    System.out.println("Do HashSet contain e?--"+hs.contains(e));

		System.out.println("After removing 1st employee size--"+hs.size());
		
		
		
		
  
	}

}
