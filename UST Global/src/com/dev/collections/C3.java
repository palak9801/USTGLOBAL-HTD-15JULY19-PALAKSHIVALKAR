package com.dev.collections;

import java.util.TreeSet;

import com.dev.collections.Employee;

public class C3 {

	public static void main(String[] args) {
		TreeSet<Employee> ts = new TreeSet<Employee>();
		
		Employee e = new Employee();
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e.setName("Palak S");
		e.setId(8200);
		e.setEmail("palak@gmail.com");
		e.setPassword("********");
		
		e1.setName("Jenivia L");
		e1.setId(1300);
		e1.setEmail("jenny@gmail.com");
		e1.setPassword("********");
		
		e2.setName("Sukanya H");
		e2.setId(3400);
		e2.setEmail("sukanya@gmail.com");
		e2.setPassword("palak");
		
		ts.add(e);
		ts.add(e1);
		ts.add(e2);
		System.out.println(ts);

	}

}
