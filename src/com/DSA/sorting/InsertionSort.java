package com.DSA.sorting;

public class InsertionSort {

	public static void main(String[] args) {
	// Take an element and place it in it's correct order
		int[] arr = {9,4,77,1343,1,4,2};	
		for(int i=0;i<arr.length;i++) {
			int j=i;
			while(j>0 && arr[j-1]>arr[j]) {
				int temp = arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				j--;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
	}

}
