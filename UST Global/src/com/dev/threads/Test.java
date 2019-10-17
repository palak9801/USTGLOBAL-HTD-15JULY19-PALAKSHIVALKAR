package com.dev.threads;

public class Test {
	
	public static void main(String []args) {
		System.out.println("Main thread started...");
		
		for(int i=1;i<=100;i++) {
			System.out.println("i="+i);
		}
		
		for(int i=0;i<10;i++) {
			System.out.println("j="+i);
		}
		
		System.out.println("main thread terminated...");

	}

}
