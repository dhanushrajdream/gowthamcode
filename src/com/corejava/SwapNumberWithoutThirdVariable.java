package com.corejava;

public class SwapNumberWithoutThirdVariable {
	
	public static void main(String[] args) {
		
		int a=555;
		int b=33;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
