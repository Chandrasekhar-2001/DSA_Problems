package com.DSA.sorting;

public class MergSort {

	// Concept : Divide and Merge
	//time[ O(n log(n))] and space complexicity [ O(n) ]
	
	public static void main(String[] args) {
		int arr[] = {38, 27, 43, 3, 9, 82, 10};
		mergeSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
	}
	public static void mergeSort(int arr[],int low ,int high) {
		if(low>=high) {
			return;
		}
		int mid = (low + high)/2;
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		merge(arr,low,mid,high);
	}
	public static void merge(int[] arr, int low,int mid, int high) {
		int[] temp=new int[high-low+1];
		int left = low;
		int right = mid+1;
		int count =0;
		while(left<=mid && right<=high) {
			if(arr[left]<=arr[right]) {
				temp[count++]=arr[left++];
			}else {
				temp[count++]=arr[right++];
			}
		}
		while(left<=mid) {
			temp[count++]=arr[left++];
		}
		while(right<=high) {
			temp[count++]=arr[right++];
		}
		for(int i=0;i<temp.length;i++) {
			arr[low+i]=temp[i];
		}
		
	}
}
