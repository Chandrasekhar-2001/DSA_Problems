package com.DSA.Recurssion;

public class PalindromeOfStringUsingRecurssion {

	public static void main(String[] args) {
		//System.out.println(palindrome(0,"abcdcba"));
		char cc = '!';
		boolean bbb = Character.isLetterOrDigit(cc);
		System.out.println(bbb);

	}
	public static boolean palindrome(int n,String str) {
		if(n>=str.length()/2) {
			return true;
		}
		if(str.charAt(n)!=str.charAt(str.length()-1-n)){
		 return false;
		}
		return palindrome(n+1,str);
	}

}
