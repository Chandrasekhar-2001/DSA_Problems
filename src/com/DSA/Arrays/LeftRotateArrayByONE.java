package com.DSA.Arrays;

public class LeftRotateArrayByONE {
	

	public static void main(String[] args) {
		
		int[] arr = {11,22,33,44,55,66,77};
		int temp = arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
		for(int i:arr) {
			System.out.print(i+"  ");
		}
	}

}
