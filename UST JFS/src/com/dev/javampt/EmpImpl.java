package com.dev.javampt;

import java.util.HashMap;

public class EmpImpl implements EmpInterface{

	HashMap<String, Employee> hm = new HashMap<String, Employee>();
	@Override
	public boolean addEmp(String i, Employee e) {
		if(e!=null) {
			hm.put(i,e);
			return true;
		}
		return false;
	}

	@Override
	public void getEmp() {
		System.out.println(hm);
		
	}

	@Override
	public boolean removeEmp(String i, Employee e) {
		hm.remove(i,e);
		return true;
	}

	@Override
	public double netPay(double Salary, Employee e) {
		if(Salary>100000)
		{
			double netSalaray = Salary - 5619 - 9.35/100;
			System.out.println("netSalary");
		}
		else if(Salary>860000 && Salary>=1000000)
		{
			double netSalary =  Salary -  4896 - 8.87/100;
			System.out.println("netSalary");
		}
		return Salary;
		
		
	}

	

	

}
