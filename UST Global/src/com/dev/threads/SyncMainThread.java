package com.dev.threads;

public class SyncMainThread  {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("SyncMain Thread started...");
		
        Printer p = new Printer();
        Printer2 p1 = new Printer2();
        
		
		//  new Thread4(p).start(); 
		//  new Thread5(p).start();
        
		/*
`*/
        
        
		/*
		 * Thread4 t6 = new Thread6(p2); t6.start(); t6.join(); new Thread7(p2).start();
		 */
       
        System.out.println("SyncMain Thread terminated...");
	}

}
//race condition ---both the thread are using the same resource p and it leads to data inconsistency.
// in order to make it synchronous we use synchronized keyword