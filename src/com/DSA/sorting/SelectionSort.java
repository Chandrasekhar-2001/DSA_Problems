package com.DSA.sorting;

import java.util.HashSet;
import java.util.Set;

public class SelectionSort {
	// SelectionSort means find minimum value and swap it to the first position and continue the process
	public static void main(String[] args) {
		int[] arr = {9,4,77,1343,1,4,2};
		for(int i=0;i<arr.length-1;i++) {
			int min =i;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int swap = arr[min];
			arr[min] = arr[i];
			arr[i] =swap;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"   ");
		}
	}
	
 
}
