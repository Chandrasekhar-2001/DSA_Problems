package com.DSA.Arrays;

public class RotateElementByKposition {
	
	//Process:Store,Shift and replace
	// TM : O(N) ; SC:O(positions)
	public static void rotateArrayToRight(int[] array, int positions) {
		int n = array.length;
		if(n==0 || positions%n>n) {
			return;
		}
		
		int[] tempArray = new int[positions];
		for(int i=n-positions;i<n;i++) {
			tempArray[positions+i-n] = array[i];
			
		}
		for(int i=n-positions-1;i>=0;i--) {
			array[i+positions]=array[i];
		}
		for(int i=0;i<positions;i++) {
			array[i]= tempArray[i];
		}
		System.out.println("Shifting elements from right to left");

		for(int i=0;i<n;i++) {
			System.out.print(array[i]+"  ");
		}
	}
	
	
	public static void rotateArray(int[] array,int first,int last) {
		while(first<=last) {
			int temp = array[last];
			array[last]=array[first];
			array[first]=temp;
			first++;
			last--;
		}
	}
	
	
	//Process:first reverse other than k positions, reverse k positions and reverse hole array
	//TC : O(N)  ; SC : O(1)
	public static void rotateArrayToRightByReversing(int[] array,int positions) {
		int arrayLength =array.length;
		rotateArray(array, 0, arrayLength-positions-1);
		rotateArray(array, arrayLength-positions, arrayLength-1);
		rotateArray(array,0,arrayLength-1);
		System.out.println();
		System.out.println("Shifting elements from left to right by reducing space complexicity");
		for(int i=0;i<arrayLength;i++) {
			System.out.print(array[i]+"  ");
		}
	}
	

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		RotateElementByKposition.rotateArrayToRight(arr, 2);
		RotateElementByKposition.rotateArrayToRightByReversing(arr,2);
	}

}
