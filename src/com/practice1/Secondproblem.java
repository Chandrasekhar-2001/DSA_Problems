package com.practice1;

public class Secondproblem {

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        System.out.println(temp.length);
        int left = low;
        int right = mid + 1;
        int count = 0;

        // Merge the two halves into temp
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[count++] = arr[left++];
            } else {
                temp[count++] = arr[right++];
            }
        }

        // Copy the remaining elements from the left half, if any
        while (left <= mid) {
            temp[count++] = arr[left++];
        }

        // Copy the remaining elements from the right half, if any
        while (right <= high) {
            temp[count++] = arr[right++];
        }

        // Copy the sorted elements from temp back to arr
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

}
