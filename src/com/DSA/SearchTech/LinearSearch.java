package com.DSA.SearchTech;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {1,5,66,8,2,9,45,100};
		int searchElement = 9;
		int position = positionOfElement(arr, searchElement);
		if(position != -1) {
			System.out.println("The element "+searchElement+" which you are searching is at position :"+position);
		}else {
			System.out.println("Sorry, the element "+searchElement+" which you are searching is not found");

		}
		System.out.println();

	}

	private static int positionOfElement(int[] arr, int searchElement) {
		int position =-1;
		for(int i=0;i<arr.length;i++) {
			if(searchElement==arr[i]) {
				position=i;
			}
		}
		return position;
	}

}
