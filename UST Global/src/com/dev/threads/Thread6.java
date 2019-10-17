package com.dev.threads;

public class Thread6 extends Thread  {
	
   
    Printer2 p2;
    
    
    public Thread6(Printer2 pref) {
    	p2 = pref;
    }
	
	@Override
	public void run() {
		
		try {
			Thread.currentThread().sleep(500);  
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		p2.printVal(10, "Thread 6");
	}

}
