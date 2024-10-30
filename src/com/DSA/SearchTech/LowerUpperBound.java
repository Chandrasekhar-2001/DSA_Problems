package com.DSA.SearchTech;

public class LowerUpperBound {
	// Brute Force approach is linear Search
	
	//TM= O(logN) , SC = O(1)
	public static int lowerBound(int[] arr, int xValue) {
		int ans=arr.length;
		int low =0,high = arr.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]>=xValue) {
				ans = mid;
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return ans;
	}
	//TM= O(logN) , SC = O(1)
	public static int upperBound(int[] arr, int xValue) {
		int ans = arr.length;
		int low = 0,high=arr.length-1;
		while(low <= high) {
			int mid = (low+high)/2;
			if(arr[mid]>xValue) {
				ans = mid;
				high =mid-1;
			}else {
				low =mid+1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,2,3};
		int x =2;
		int lowerIndex = lowerBound(arr,x);
		System.out.println("The lower bound is the index :"+lowerIndex);
		int[] arr2 = {3,5,8,9,15,19};
		int  xValue=9;
		int upperIndex = upperBound(arr2,xValue);
		System.out.println("The Upper bound is the index :"+upperIndex);
	}

}
