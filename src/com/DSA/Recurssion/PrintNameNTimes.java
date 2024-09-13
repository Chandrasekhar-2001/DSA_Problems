package com.DSA.Recurssion;

public class PrintNameNTimes {
	
	public static void main(String[] args) {
		recName(0,5);

	}
	public static void recName(int i,int n) {
		if(i>n) {
			return ;
		}
		System.out.println("chandu");
		recName(i+1,n);
	}

}
