package com.dev.javampt;

public class EmpData {

	public static void main(String[] args) {
		
		EmpImpl d = new EmpImpl();
		
		Employee e1 = new Employee();
		e1.setEmp_id(11);
		e1.setEname("Palak");
		e1.setEmail("palak@gmail.com");
		e1.setPassword("palak123");
		e1.setSalary(300000);
		boolean b1 = d.addEmp("1", e1);
		System.out.println("1st Employee added--"+b1);
		
		Employee e2 = new Employee();
		e2.setEmp_id(11);
		e2.setEname("Pushkar");
		e2.setEmail("pushkar@gmail.com");
		e2.setPassword("pushkar123");
		e2.setSalary(500000);
		boolean b2 = d.addEmp("2", e2);
		System.out.println("2nd Employee added--"+b2);
		
		Employee e3 = new Employee();
		e3.setEmp_id(11);
		e3.setEname("Jenny");
		e3.setEmail("jenny@gmail.com");
		e3.setPassword("jenny123");
		e3.setSalary(250000);
		boolean b3 = d.addEmp("3", e3);
		System.out.println("3rd Employee added--"+b3);
		
		Employee e4 = new Employee();
		e4.setEmp_id(11);
		e4.setEname("bhakti");
		e4.setEmail("bhakti@gmail.com");
		e4.setPassword("bhakti123");
		e4.setSalary(850000);
		boolean b4 = d.addEmp("4", e4);
		System.out.println("4th Employee added--"+b4);
		
		System.out.println();
		System.out.println("All the Employee added are--");
		d.getEmp(); 
		
		boolean b5 = d.removeEmp("2", e2);
		System.out.println("Employee removed--"+b5);
		d.getEmp();
		
		System.out.println();
		System.out.println("SalGrade is--");
		if(e1.getSalary()>100000) {
			System.out.println("AA");
		}
			else if(e1.getSalary()<100000 && e1.getSalary()>860000) {
				System.out.println("A");
			}
			else if(e1.getSalary()<860000 && e1.getSalary()>540000) {
				System.out.println("B");
			}
			else if(e1.getSalary()<540000 && e1.getSalary()>380000) {
				System.out.println("C");
			}
			else if(e1.getSalary()<380000 && e1.getSalary()>160000) {
				System.out.println("D");
			}
		
		System.out.println();
		System.out.println("NetPay--");
		if(e1.getSalary()>100000) {
			double netSal = e1.getSalary() - 9.35/100 - 5619;
			System.out.println(netSal);
		}
			else if(e1.getSalary()<100000 && e1.getSalary()>860000) {
				double netSal =e1.getSalary() - 8.87/100 - 4896;
				System.out.println(netSal);
			}
			else if(e1.getSalary()<860000 && e1.getSalary()>540000) {
				double netSal = e1.getSalary() - 8.19/100 - 4321;
				System.out.println(netSal);
			}
			else if(e1.getSalary()<540000 && e1.getSalary()>380000) {
				double netSal = e1.getSalary() - 7.34/100 - 3765;
				System.out.println(netSal);
			}
			else if(e1.getSalary()<380000 && e1.getSalary()>160000) {
				double netSal = e1.getSalary() - 5.4/100 - 3189;
				System.out.println(netSal);
			}
		
		
		
			
		}
	
	
		
		
		
	
		

	}


