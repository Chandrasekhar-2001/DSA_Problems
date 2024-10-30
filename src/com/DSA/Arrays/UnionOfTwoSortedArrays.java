package com.DSA.Arrays;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class UnionOfTwoSortedArrays {
	//TC and SC: O(array1.length+array2.length) 
	public static void byUsingMap(int[] array1,int[] array2) {
		HashMap<Integer,Integer> hashMap = new HashMap<>();
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for(int i=0;i<array1.length;i++) {
			hashMap.put(array1[i], hashMap.getOrDefault(array1[i], 0)+1);
		}
		for(int i=0;i<array2.length;i++) {
			hashMap.put(array2[i], hashMap.getOrDefault(array2[i], 0)+1);
		}
		System.out.println(" By Using Hashmap : ");
		for(int keyValue:hashMap.keySet()) {
			arrList.add(keyValue);
			System.out.print(keyValue+"  ");
		}
		System.out.println();
	
	}
	
	//TC and SC: O(array1.length+array2.length) 
	public static void byUsingSet(int[] array1,int[] array2) {

		LinkedHashSet<Integer> hashSet = new LinkedHashSet<Integer>();
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for(int i=0;i<array1.length;i++) {
			hashSet.add(array1[i]);
		}
		for(int i=0;i<array2.length;i++) {
			hashSet.add(array2[i]);
		}
		System.out.println(" By Using HashSet : ");
		for(int value:hashSet) {
			arrList.add(value);
			System.out.print(value+"  ");
		}
		System.out.println();
	
	
	}
	
	
	public static void byUsingPointers(int[] array1,int[] array2) {
		int n = array1.length;
		int m = array2.length;
		int i=0,j=0;
		ArrayList<Integer> union = new ArrayList<>();
		
		while(i<n && j<m) {
			if(array1[i]<=array2[j]) {
				if(union.size()==0 || union.get(union.size()-1) != array1[i]) {
					union.add(array1[i]);		
				}
				i++;
			}else {
				if(union.size() == 0 || union.get(union.size()-1) != array2[j]) {
					union.add(array2[j]);
				}
				j++;
			}
		}
		while(i<n) {
			if(union.size() == 0 || union.get(union.size()-1) != array1[i]) {
				union.add(array1[i]);
				i++;
			}
		}
		while(j<m) {
			if(union.size()==0 || union.get(union.size()-1) != array2[j]) {
				union.add(array2[j]);
				j++;
			}
		}
		System.out.println("By Using Pointers :");
		for(int k=0;k<union.size();k++) {
			System.out.print(union.get(k)+"  ");
		}
	}

	public static void main(String[] args) {
		int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int arr2[] = {2, 3, 4, 4, 5, 11, 12};
		byUsingMap(arr1, arr2);
		byUsingSet(arr1, arr2);
		byUsingPointers(arr1, arr2);
	}

}
