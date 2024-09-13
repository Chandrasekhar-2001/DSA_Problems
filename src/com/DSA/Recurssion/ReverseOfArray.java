package com.DSA.Recurssion;

public class ReverseOfArray {

	public static void main(String[] args) {
		//APPROACH_1  Time and Space : O(n/2)=O(n) and O(1)
		int[] arr = {1,2,3,4,5,6};
		
		for(int i=0;i<arr.length/2;i++) {
			int temp = arr[arr.length-1-i];
			arr[arr.length-1-i] = arr[i];
			arr[i]=temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		/* APPROACH_2	Time and Space : O(n)+O(n)=O(n) and O(n)+O(n)=O(n)
		int[] arr = {1,2,3,4,5};
		int[] arr2 = new int[arr.length];
		
		for(int i=arr.length-1,j=0;i>=0;i--,j++) {
		arr2[j]=arr[i];
		
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr2[i]);
		}
		*/
	}

}
