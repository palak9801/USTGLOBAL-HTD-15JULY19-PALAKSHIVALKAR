package com.dev.encapsulation;

public class StudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Student s = new Student();
            s.setRegno(20150515);
            s.setName("palak");
            s.setEmail("palak@gmail.com");
            s.setPassword("palak");
            
           int regno =  s.getRegno();
           System.out.println("Registration number--"+regno);
           
         
           System.out.println("Name--"+(s.getName()));
           
          
           System.out.println("Email id----"+s.getEmail()); 
            
	}

}
