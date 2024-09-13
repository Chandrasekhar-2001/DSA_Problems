package com.DSA.Recurssion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class PalindromeOfString {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter your input");
		try {
		String str = br.readLine();
		 boolean bb = false;
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)==str.charAt(str.length()-1-i)) {
			   bb = true;
			}else {
				break;
			}
		}
		System.out.println(" flag "+bb);
		}
		catch(IOException io) {
			io.printStackTrace();
		}
		
	}

}
