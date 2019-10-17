package com.dev.collections;

import java.util.HashMap;

public class EmpIntD implements EmpInterface {
	
	HashMap<String,Employee> hm = new HashMap<String,Employee>();

	@Override
	public boolean addEmp(String i, Employee e) {
		
		if(e!=null) {
		hm.put(i, e);

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
		hm.remove(i, e);
		return true;
	}


	}

	

	

	


