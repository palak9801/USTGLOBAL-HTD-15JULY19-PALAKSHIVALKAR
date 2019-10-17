package com.dev.collections;

public class EmpData2 {

	public static void main(String[] args) {
		EmpData d = new EmpData();
		Employee e = new Employee();
		Employee e1 = new Employee();
		
		e.setName("palak");
	 e.setEmail("pa");
	 
	 e1.setName("palak");
	 e1.setEmail("palakskks");
               
               
	 boolean b = d.addEmp(e);
	 boolean b1 = d.addEmp(e1);
	 System.out.println(b);
	 
	 d.getEmp();
	 
	 boolean f = d.removeEmp(e1);
	 System.out.println(f);
	 
	 d.getEmp();
	 
	}

}
