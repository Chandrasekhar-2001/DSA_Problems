package com.DSA.Arrays;

public class CheckArraySortedOrNot {
	// it is work if array is sorted in ascending and descending
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		System.out.println(verifySortedArrayOrNot(arr));

	}
	public static boolean verifySortedArrayOrNot(int[] arr) {
		boolean flag = true;
		if(arr.length==0 || arr.length==1) {
			return true;
		}
		boolean order = (arr[0]<=arr[arr.length-1])?true:false;
		for(int i=0;i<arr.length-1;i++) {
			if(order && arr[i]>arr[i+1]) {
				return false;
			}
			if(!order && arr[i]<arr[i+1]) {
				return false;
			}
				
		}
		return flag;
	}
}
