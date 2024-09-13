package com.DSA.Recurssion;

public class SumOfFirstN_Numbers {

	public static void main(String[] args) {
		System.out.println(sumofN(5));
		
	}
	public static int sumofN(int n) {
		if(n==0) {
			return 0;
		}
		return n+sumofN(n-1);
	}

}
