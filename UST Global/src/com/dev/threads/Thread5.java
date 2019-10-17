package com.dev.threads;

public class Thread5 extends Thread  {
	
    Printer p;
    
    
    public Thread5(Printer pref) {
    	p = pref;
    }
	
	@Override
	public void run() {
		
		try {
			Thread.currentThread().sleep(500);  
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		p.printVal(10, "Thread5");
	}

}
