package com.DSA.Hashing;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ArrayHashing {

	public static void main(String[] args) {
		
		/* For int in java we can go the maximum of 10 power 9 */
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int[] array= {1,7,4,8,2,7,7,8,1};
			
			System.out.println("Please enter total number of digits you wanted to search for count");
			int n = Integer.parseInt(br.readLine());
			int[] userarray= new int[n];
			while(n>0) {
				userarray[n-1]=Integer.parseInt(br.readLine());
				n--;
			}
			int[] hashArray = new int[1000000000];
			for(int i=0;i<array.length;i++) {
				hashArray[array[i]]++;
			}
			for(int i=0;i<userarray.length;i++) {
				System.out.println("Element :"+userarray[i]+" count :"+hashArray[userarray[i]]);
			}
			
		}catch(IOException io) {
			io.printStackTrace();
		}
	}

}
