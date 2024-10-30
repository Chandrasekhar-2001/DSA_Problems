package com.DSA.Arrays;
import java.util.ArrayList;

public class MoveZerosToEnd {
	// TC: O(N) ; SC: O(1)
	public static void moveZerosToEndOfArray(int[] array) {
		int arrSize = array.length;
		int j=-1;
		for(int i=0;i<arrSize;i++) {
			if(array[i]==0) {
				j=i;
				break;
			}
		}
		if(j==-1) {
			return;
		}
		for(int i=j+1;i<arrSize;i++) {
			if(array[i]!=0) {
				int temp = array[i];
				array[i]=array[j];
				array[j]=temp;
				j++;
			}
		}
	}
	
	// TC :O(N) ; SC : O(N)  - since external arrayList has used for storing elements
	public static void moveZerosToEndOfArrayUsingExterStorge(int[] array) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i=0;i<array.length;i++) {
			if(array[i]!=0) {
			arrayList.add(array[i]);
			}
		}
		for(int i=0;i<arrayList.size();i++) {
			array[i]=arrayList.get(i);
		}
		for(int i=arrayList.size();i<array.length;i++) {
			array[i]=0;
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+"  ");
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,0,2,3,2,0,0,4,5,1};
		moveZerosToEndOfArray(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		moveZerosToEndOfArrayUsingExterStorge(arr);
	}

}
