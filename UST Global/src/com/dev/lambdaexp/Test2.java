package com.dev.lambdaexp;

public class Test2 {

	public static void main(String[] args) {
	
		FunctInt2 f3 = ()->{
			System.out.println("Additon and Division output--");
		};
		f3.print();

		FunctInt1 f = (int a, int b) -> {
			
			int sum = a+b;
			System.out.println("Addition = "+sum);
					
		};
		f.add(50, 80);
		
		FunctInt3 f2 = ()->{
			try {
				int result = 10/5;
				System.out.println("Division --"+result);
			}catch(Exception e) {
				System.out.println("Exception occured");
			}
	
		};
		f2.divide();
    
		
		
	}

}
