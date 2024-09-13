package com.DSA.sorting;

public class BubbleSort {

	public static void main(String[] args) {
	//BubbleSort: push the maximum element  to the last by adjustment swaps
		
		int[] arr = {9,4,77,1343,1,4,2};	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]= temp;
			}
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+"  ");
	}
	}

}
