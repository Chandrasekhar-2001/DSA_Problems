package com.DSA.SearchTech;

public class BinarySearch {
	//Note: The key is that the data structure must support ordered traversal, allowing the 
	//binary search algorithm to divide the search space in half at each step.
	
	//Through Iterative way:  
	//TC: We always divide array size(assume array size n) by 2 for x times.So 2 power x =n
	//therefore x=log n with base 2 . TM =O(log n)
	//SC = O(1)
	public static int binarySearchInIterativeWy(int[] array,int number) {
		int low=0, high = array.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(array[mid]==number) 
				return mid;
			else if(number>array[mid]) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return -1;
	}
	// TM:O(log n) SC:O(log n)(average and worst) and best is o(1)
	public static int binarySearchByRecurssion(int[] array,int number,int low,int high) {
		if(low > high) {
			return -1;
		}
		int mid = (low+high)/2;
		if(array[mid] == number) return mid;
		else if(number>array[mid]) return binarySearchByRecurssion(array,number,mid+1,high);
		else return binarySearchByRecurssion(array,number,low,mid-1);
	}
	
	public static void searchElement(int[] array, int number) {
		int position = binarySearchByRecurssion(array,number,0,array.length);
		if(position!=-1) {
			System.out.println("Through binarySearchByRecurssion way - position :"+position);
		}else {
			System.out.println("Through binarySearchByRecurssion way - Number not found");
		}
	}
	public static void main(String[] args) {
		int[] arr = { 5,6,7,8,9,10,11,12,13};
		int number = 13;
		int position = binarySearchInIterativeWy(arr,number);
		if(position!=-1) {
			System.out.println("Through Iterative way - position :"+position);
		}else {
			System.out.println("Through Iterative way - Number not found");
		}
		searchElement(arr,number);
	}

}
