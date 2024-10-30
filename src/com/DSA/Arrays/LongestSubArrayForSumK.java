package com.DSA.Arrays;

import java.util.HashMap;

//problem : Longest Subarray with given Sum K(Positives)
//Problem Statement : Given an array and a sum k, we need to print the length of the longest subarray that sums to k.
public class LongestSubArrayForSumK {
	
	public static int getLengthOfKSumOfLongestSubArray(int[] array, long Ksum) {
		int maxLen =0;
		long sum=0;
		HashMap<Long,Integer> previousSumMap = new HashMap<>();
		for(int i=0;i<array.length;i++) {
			sum =sum+array[i];
			if(sum==Ksum) {
				maxLen = Math.max(maxLen, i+1);
			}
			long remValue = sum-Ksum;
			if(previousSumMap.containsKey(remValue)) {
				int len = i-previousSumMap.get(remValue);
				maxLen = Math.max(maxLen, len);
			}
			if(!previousSumMap.containsKey(sum)) {
				previousSumMap.put(sum, i);
			}
			
		}
		
		return maxLen;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,1,1,1,1,4,2,3}; 
        long k = 3;
		System.out.println(getLengthOfKSumOfLongestSubArray(arr,k));

	}

}
