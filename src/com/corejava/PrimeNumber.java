package com.corejava;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int a=999;
		int count=0;
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				count=count+1;
			}
		}
		if(count==0) {
				System.out.println("PRIME NUMBER");
			}
			else {
				System.out.println("NOT PRIME NUMBER");
			}
		}
}

		
