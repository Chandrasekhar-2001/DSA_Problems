package com.DSA.Arrays;
import java.util.LinkedHashSet;
public class RemoveduplicatesFromSortedArray {
	// Approach-1 : we use linkedhashset to solve this problem
	// TM : O(n)+O(n)=O(n) , SC :O(n)+O(n)=O(n)
	public static int duplicateRemoverUsingExpertalStorage(int arr[]) {
		LinkedHashSet<Integer> lset = new LinkedHashSet();
		
		for(int i=0;i<arr.length;i++) {
			lset.add(arr[i]);
		}
		int j=0;
		for(int i:lset) {
			arr[j++] = i;
		}
		return j;
	}
	
	//Approach-2 : we use a single for loop  TM: O(n) , SC: O(1)
	public static int dupicateRemoverInArray(int arr[]) {
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[j]!=arr[i]) {
				j++;
				
				arr[j] =arr[i];
			}
		}
		return j+1;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,1,1,1,2,2,2,2,3,3,3,3};
		//int k =duplicateRemoverUsingExpertalStorage(arr);  // approach-1
		int k =dupicateRemoverInArray(arr);					//approach-2
		for(int i=0;i<k;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
