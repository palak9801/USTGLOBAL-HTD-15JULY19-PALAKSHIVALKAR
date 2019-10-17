package com.dev.collections;

public class EmpD {

	public static void main(String[] args) {
		
		EmpIntD d = new EmpIntD();
		
		Employee e1 = new Employee();
	    e1.setName("pushkar");
		e1.setEmail("pushkarr@gmail.com");
		e1.setId(12856);
		e1.setPassword("palakpushkar");
		boolean b1= d.addEmp("1",e1);
		d.getEmp();
		
		Employee e2 = new Employee();
		e2.setName("tejas");
		e2.setEmail("tejasss@gmail.com");
		e2.setId(1876);
		e2.setPassword("palaktejas");
		boolean b2= d.addEmp("2", e2);
		d.getEmp();
		
		Employee e3 = new Employee();
	    e3.setName("palak");
		e3.setEmail("palakr@gmail.com");
		e3.setId(128656);
		e3.setPassword("palakpushkarpalak");
		boolean b3= d.addEmp("3", e3);
		d.getEmp();
		
		
		
		System.out.println("2nd emp added-- "+b1+" "+"3rd Emp added-- "+b2);
		
		
		
		boolean b = d.removeEmp("2", e2 );
		System.out.println("removed-- "+b);
		
		d.getEmp();
		
		
		
		
	
		
		

	}

}
