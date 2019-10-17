package com.dev.collections;

import java.util.HashMap;
import java.util.HashSet;

import com.dev.collections.Employee;

public class EmpData implements Emp {
	

    HashSet<Employee> hs = new HashSet<Employee>();
	
	@Override
	public boolean addEmp(Employee e) {
		if(e!=null) {
			hs.add(e);
			hs.add(e);
			hs.add(e);
			return true;
		}
		return false;
	}
    @Override
	public void getEmp() {
	System.out.println(hs);
		
	}
    @Override
	public boolean removeEmp(Employee e) {
		
		boolean b = hs.remove(e);
		if(b) {
			return true;
		}
		
		return false;		
	}
	
	
	
	
	
}
