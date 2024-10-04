package com.DSA.Arrays;

public class SecondLargestInArrayWihoutSorting {
	// TM : O(n) , SC : O(1)
	public static void main(String[] args) {
		int least = Integer.MAX_VALUE;
		int second_least = Integer.MAX_VALUE;
		int highest = Integer.MIN_VALUE;
		int second_highest = Integer.MIN_VALUE;
		int[] arr = {4,222,5,66,1,9,90};
		for(int i=0;i<arr.length;i++) {
			least = Math.min(least,arr[i]);
			highest = Math.max(highest, arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<second_least && arr[i] != least) {
				second_least = arr[i];
			}
			if(arr[i]>second_highest && arr[i] !=highest) {
				second_highest = arr[i];
			}
		}
		System.out.println("1 highest :"+highest+" 2nd highest :"+second_highest);
		System.out.println("1 least :"+least+" 2nd least :"+second_least);

	}

}
