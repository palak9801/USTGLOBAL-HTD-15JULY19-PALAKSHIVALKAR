package com.dev.assignment;

public class Sum_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[] = {1, 2, 13, 10, 5, 6, 8};
      
      int first ,mid,secondlast;
      first=a[0];
      mid=a[(a.length)/2];
      secondlast=a[a.length-2];
      
     // float res=a[0]+(a[0]+a.length-1)/2+a.length;
      int res=first+mid+secondlast;
      
      System.out.println("first element is-- "+first);
     System.out.println("mid element is-- "+mid);
     System.out.println("2nd last element is-- "+secondlast);
     System.out.println("addidtion is-- "+res);
     
      
	}

}
