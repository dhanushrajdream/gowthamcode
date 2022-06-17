package com.corejava;

public class ReverseString {
	public static void main(String[] args) {
		String s="akash hghfhf";
		char[] a=s.toCharArray();
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]);
			
		}
		StringBuilder sb=new StringBuilder("ANBU");
		sb.reverse();
		System.out.println(sb.toString());
		 	
	}

}
