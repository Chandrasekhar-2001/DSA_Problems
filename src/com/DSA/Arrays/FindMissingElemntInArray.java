package com.DSA.Arrays;





public class FindMissingElemntInArray {
	
	//Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. 
    //  Find the number(between 1 to N), that is not present in the given array.
	//TC : O(N)  ; SC : O(1)
	public static int findMissingElemntInArray(int[] array, int N) {
		
		for(int i=1;i<N;i++) {
			if(array[i-1]+1!=array[i]) {
				return i+1;
			}
		}
		return -1;
	}
	
	//TC : O(N)  ; SC : O(1)
	public static int findMaxConsecutiveOnes(int nums[]) {
        int cnt = 0;
        int maxi = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }

            maxi = Math.max(maxi, cnt);
        }
        return maxi;
    }

	public static void main(String[] args) {
		int[] arr = {1,3};
		System.out.println(findMissingElemntInArray(arr, 3));
		System.out.println(findMaxConsecutiveOnes(arr));
	}

}
