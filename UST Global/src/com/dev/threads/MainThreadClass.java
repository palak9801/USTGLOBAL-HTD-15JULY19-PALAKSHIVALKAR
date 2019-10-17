package com.dev.threads;

public class MainThreadClass{

	public static void main(String[] args) {
		System.out.println("Main thread started...");
		
		new Thread2().start();          //object of t2 is created
		Thread2 t2 = new Thread2();
		t2.setName("Thread T2");
		
		
		Thread3 t3 = new Thread3();
		Thread t = new Thread(t3);
		
		
		
		
		//new Thread(new Thread3()).start();   //object to implement t3
		
		Thread.currentThread().setName("main Thread");
		
		t2.setPriority(2);
		t.setPriority(6);
		
		
		 for(int i=1;i<=10;i++) {
			System.out.println("i="+i);
		}
		  System.out.println("thread name--"+t2.getName());
		  System.out.println("main thread name--"+Thread.currentThread().getName());
		  System.out.println("Thread2 id --"+t2.getId());
		  System.out.println("Thread3 id --"+t.getId());
		  System.out.println("Thread2 priority --"+t2.getPriority());
		  System.out.println("Thread3 priority --"+t.getPriority());
		System.out.println("main thread terminated...");

	}

}
