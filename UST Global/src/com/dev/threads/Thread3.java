package com.dev.threads;

public class Thread3 implements Runnable {  //2nd way to create thread

	

	@Override
	public void run() {
 System.out.println("T2 thread started...");
		 
		 for(int k=1;k<=10;k++) {
			 System.out.println("k="+k);
		 }
		 
		 System.out.println("T2 thread terminated");
		
	}

}
