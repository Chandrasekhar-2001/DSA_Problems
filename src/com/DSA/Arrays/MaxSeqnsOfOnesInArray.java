package com.DSA.Arrays;

public class MaxSeqnsOfOnesInArray {
	
	public static int maxSeqnsOfOnesInArray(int[] array) {
		int count=0,max=0;
		for(int i=0;i<array.length;i++) {
			
			if(array[i]==1) {
				count++;
			}else {
				count =0;
			}
			max = Math.max(count, max);
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = {1, 1, 1,1,0, 1, 1, 1,0,1};
		System.out.println(maxSeqnsOfOnesInArray(arr));

	}

}
