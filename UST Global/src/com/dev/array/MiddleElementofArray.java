package com.dev.array;

public class MiddleElementofArray {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,20,50};
		
		int l=arr.length;
		int m=(l/2);
		System.out.println("Middle element is--"+arr[m]);
		
		int s=l-2;
		System.out.println("Second last element is--"+arr[s]);
		

	}

}
