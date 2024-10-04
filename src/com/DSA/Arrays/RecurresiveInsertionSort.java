package com.DSA.Arrays;

public class RecurresiveInsertionSort {
	// Method to perform recursive insertion sort
    public static void insertionSort(int[] arr, int n) {
        // Base case: If the size of the array is 1, it's already sorted
        if (n <= 1) {
            return;
        }
        
        // Recursively sort the first n-1 elements
        insertionSort(arr, n - 1);
        
        // Insert the nth element into its correct position
        int key = arr[n - 1];
        int j = n - 2;
        
        // Move elements of arr[0..n-2], that are greater than key, to one position ahead
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }

    // Helper method to print the array
    public static void printArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) { // Skip the first element which holds the size
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
	public static void main(String[] args) {
		 // The first element is used to store the size of the array
        int[] arr = new int[8];  // Adjust the size accordingly
        arr[0] = 7;  // The size of the array (excluding the first element)

        // Initialize the array with some values
        arr[1] = 64;
        arr[2] = 34;
        arr[3] = 25;
        arr[4] = 12;
        arr[5] = 22;
        arr[6] = 11;
        arr[7] = 90;

        int n = arr[0]; // The size of the array
        System.out.println(n+"  ");
        System.out.println("Original array:");
        printArray(arr);
        
        // Call the recursive insertion sort, starting from index 1
        insertionSort(arr, n);
        
        System.out.println("Sorted array:");
        printArray(arr);
	}

}
