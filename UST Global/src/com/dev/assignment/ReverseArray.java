package com.dev.assignment;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of array");
		int n=sc.nextInt();
		
		int[] a1 = new int[n];
		System.out.println("enter the array elements");
		
		for(int j=0;j<n;j++) {
		 a1[j]=sc.nextInt();
		}	
		System.out.println("Reverse of array is-- ");
    // int a[] = { 1, 2, 2,3};
     for(int i=n-1;i>=0;i--)
     {
    	 
    	 System.out.print(a1[i]+" ");
     }

}
}
