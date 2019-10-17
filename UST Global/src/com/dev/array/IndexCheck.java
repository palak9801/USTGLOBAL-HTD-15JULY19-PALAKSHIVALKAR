package com.dev.array;

public class IndexCheck {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60};
		int index=2;
		int l=arr.length;
		
		if(index>0 && index<l)
		{
			System.out.println("Index is present");
			for(int i=0;i<=index;i++)
			{
				System.out.println(arr[i]);
			}
		}
		else
		{
			System.out.println("Index is not present");
		}

	}

}
