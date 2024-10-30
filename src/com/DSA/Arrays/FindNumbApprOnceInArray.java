package com.DSA.Arrays;

public class FindNumbApprOnceInArray {
	/*Problem 		   :Find the number that appears once, and the other numbers twice 
	 *Problem Statement:Given a non-empty array of integers arr, every element appears twice except for one. 
	 * 					Find that single one.*/
	
	
	
/*   * Two important properties of XOR are the following:
	 * 
	 * XOR of two same numbers is always 0 i.e. a ^ a = 0. ←Property 1. XOR of a
	 * number with 0 will result in the number itself i.e. 0 ^ a = a. ←Property 2
	 */
	//TC: O(N) ; SC:O(1)
	public static int byUsingXORoperator(int[] arr) {
		int finalValue =0;
		for(int i=0;i<arr.length;i++) {
			finalValue=finalValue^arr[i];
		}
		return finalValue;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,4,2,1,4,6,6,5};
		System.out.println(byUsingXORoperator(arr));
	}

}
