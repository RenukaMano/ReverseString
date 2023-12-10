package com.renuka;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello";
		char[] charr = str.toCharArray();
	for(int i= charr.length-1;i>=0;i--) {
		//System.out.println(charr[i]);
		System.out.print(charr[i]);
	}
		
	}

}
