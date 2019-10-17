package com.dev.array;

public class CreatingArrays {

	public static void main(String[] args) {
		int []intArr;
		char[] charArr;       //declaration of an array
		byte byteArr[];
		

		intArr = new int[5];
		charArr = new char[5];      //creating an array
		byteArr = new byte[3];

		intArr[0]=100;
		intArr[1]=200;
		intArr[2]=300;
		intArr[3]=400;
		intArr[4]=500;

//		charArr[0]='P';
//		charArr[1]='A';
//		charArr[2]='L';         //initialization
//		charArr[3]='A';
//		charArr[4]='K';
//
//		byteArr[0]=0;
//		byteArr[1]=2;
//		byteArr[2]=8;
		
		
		
		
		
		int res = intArr[0] + 20;
		System.out.println("Addition--"+res);
		
		int res1 = intArr[1] - 50;
		System.out.println("Subtraction--"+res1);
		
		int res2 = intArr[2] * 40;
		System.out.println("Multiplication--"+res2);
		
		int res3 = intArr[3] / 10;
		System.out.println("Division--"+res3);
		
		int res4 = intArr[4] % 22;
		System.out.println("Modulus--"+res4);
		
		
		int[] intArr2 = new int[5];    //declaration & creation
		int[] intArr3 = { 11,22,33,44,55,66};        //declaration and initialization 
		System.out.println(intArr3[2]);
		System.out.println("length of the array--"+intArr3.length);




	}

}
