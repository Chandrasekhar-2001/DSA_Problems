package com.DSA.sorting;

public class QuickSort {
	/*CONCEPT :
	 * Pick an element and place at its right position in the sorted array
	 * Swap the elements in such a way that smaller to the left and bigger to the right of the selected element
	*/
	//time complexicity
	/*
	 * best   : O(nlogn)
	 * average: O(nlogn)
	 * worst: O(n square)
	*/
	
	//Space complexicity
	/*
	 * best and average :O(logn)
	 * worst : O(n) - in highly unbalanced cases where the recursion depth is equal to n
	*/
	public static void main(String[] args) {
		int arr[] = {38, 27, 43, 3, 9, 82, 11};
		quickSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}

	}
	public static void quickSort(int[] arr, int low, int high) {
		if(low<high) {
			int parity = partition(arr,low,high);
			quickSort(arr,low ,parity-1);
			quickSort(arr,parity+1,high);
		}
	}
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[low];
		int left=low+1;
		int right = high;
		while(left<=right) {
			while(left<=right && arr[left]<=pivot) {
				left++;
			}
			while(left<=right && arr[right]>pivot) {
				right--;
			}
			if(left<right) {
				swap(arr,left,right);
			}
		}
		swap(arr,low,right);
		return right;
	}
	public static void swap(int[] arr, int i,int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
			}

}
