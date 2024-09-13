package com.practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Firstproblem {
	

	public static void main(String[] args) {
		 int[] array = {38, 27, 43, 3, 9, 82, 10}; // Example array
	        System.out.println("Unsorted array:");
	        printArray(array);
	        
	        mergeSort(array, 0, array.length - 1);
	        
	        System.out.println("\nSorted array:");
	        printArray(array);
}
	// Merge sort method
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            // Recursively sort the first half
            mergeSort(array, left, middle);

            // Recursively sort the second half
            mergeSort(array, middle + 1, right);

            // Merge the sorted halves
            merge(array, left, middle, right);
        }
    }
	
 // Merge method to combine two sorted halves
    public static void merge(int[] array, int left, int middle, int right) {
        // Sizes of the two subarrays to be merged
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Temporary arrays to hold the values
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, middle + 1, rightArray, 0, n2);

        // Initial indexes for leftArray, rightArray, and merged array
        int i = 0, j = 0, k = left;

        // Merge the two subarrays back into the original array
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        // Copy the remaining elements of leftArray, if any
        while (i < n1) {
            array[k++] = leftArray[i++];
        }

        // Copy the remaining elements of rightArray, if any
        while (j < n2) {
            array[k++] = rightArray[j++];
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
	
 
}
