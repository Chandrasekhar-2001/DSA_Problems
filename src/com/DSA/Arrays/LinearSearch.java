package com.DSA.Arrays;

public class LinearSearch {

	public static int linearSearch(int[] arr,int number) {
		for(int i=0;i<arr.length;i++) {
			if(number==arr[i]) {
				return i+1;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {1,33,6,7,8,9};
		int number =9;
		int returnValue = linearSearch(arr, number);
		if(returnValue!=-1) {
		System.out.println("Therefore the number "+number+" you are trying to search is at position : "+returnValue);
		}else {
			System.out.println("We are sorry, the number "+number+" you are trying to search is not FOUND");
		}
		

	}

}
