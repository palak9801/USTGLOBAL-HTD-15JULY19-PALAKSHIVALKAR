package com.dev.lambdaexp;

public class Test {

	public static void main(String[] args) {
		FunctInterface f = () -> {
			for(int i=0;i<=10;i++) {
				System.out.println("i = "+i);
			}
		};
		f.printVal();

	}

}
