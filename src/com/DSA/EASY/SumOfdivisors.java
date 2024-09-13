package com.DSA.EASY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfdivisors {

	public static void main(String[] args) {
	System.out.println("Please enter your Input :");	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try(br) {
			int number = Integer.parseInt(br.readLine());
			long ll = 0;
			long[] arr = new long[number+1];
			for(int i=1;i<=number;i++) {
				for(int j=i;j<=number;j+=i) {
					arr[j]+=i;
				}
				ll = ll+arr[i];
			}
						System.out.println(ll);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
