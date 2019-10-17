package com.dev.threads;
      //as it is extending thread, we can say t2 will implement runnable 
public class Thread2 extends Thread {     //T2 is a thread we can say    1st way to create thread
	
	@Override
	public void run() {
		 System.out.println("T2 thread started...");
		 
		 for(int j=1;j<=10;j++) {
			 System.out.println("j="+j);
		 }
		 
		 System.out.println("T2 thread terminated");
	}

}
