package com.DSA.Arrays;

public class FindLargest2NdlargestInArray {
		// We use quick sort to find the largest  
		// Why quick sort() - It has the less time complexity and space complexity compared to other sorting technique
		// TM: O(nlogn) , SC : O(1)
		public static void main(String[] args) {
			int arr[] = {4,222,56,90,11,1,8,20};
			System.out.println("GIVEN ARRAY");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+"  ");
			}
			System.out.println();
			System.out.println("SORTED ARRAY");
			quickSort(arr,0,arr.length-1);
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+"  ");
			}
			System.out.println();
			System.out.println("\n");
			System.out.println("The largest element in the array is :"+arr[arr.length-1]);
			System.out.println("The Second largest element in the array is :"+arr[arr.length-2]);
		}
		public static void quickSort(int[] arr,int low , int high) {
			if(low<high) {
				int selectedIndex = partition(arr,low,high);
				quickSort(arr,low,selectedIndex-1);
				quickSort(arr,selectedIndex+1,high);
			}
			
		}
		private static int partition(int[] arr, int low, int high) {
			int pivot = arr[low];
			int left = low+1;
			int right = high;
			while(left<=right) {
				while(left<=right && arr[left]<=pivot) {
					left++;
				}
				while(left<=right && arr[right]>=pivot) {
					right--;
				}
				if(left<right) {
					swap(arr,left,right);
				}
			}
			swap(arr,low,right);
			return right;
		}
		private static void swap(int[] arr, int left, int right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
		}
}
