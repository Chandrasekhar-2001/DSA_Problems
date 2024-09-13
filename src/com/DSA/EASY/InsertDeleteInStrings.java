package com.DSA.EASY;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class InsertDeleteInStrings {

	public static void main(String[] args) {
		Long ll = Long.valueOf(1);
		//System.out.println(ll);
		if(ll!=0) {
			System.out.println(ll);
		}else {
			System.out.println("hello");
		}
	}
	public static int minOperations(String str1, String str2) 
	{ 
		if(str2.equals(str1)) {
			return 0;
		}else {
			if(str2.isBlank()) {
				return str1.length();
			}else if(str1.isBlank()){
				return str2.length();
			}
		}
		
		StringBuilder sb = new StringBuilder(str1);
		int count1 =0,count2=0,count=0;
		for(int i=0;i<str2.length();i++) {
			
			for(int j=0;j<str1.length();j++) {
				
				
				  if(str2.charAt(i)==str2.charAt(j) && i==j) { //sb.deleteCharAt(j);
				  //sb.insert(j, '$'); count1 = count1+1; 
					  break; 
					}else  if(str2.charAt(i)==str1.charAt(j) && i!=j){
						System.out.println(str2.charAt(i)+"   "+i+"  "+j);
					count1=count1+1;
					count2 =count2+2;
					break;
				  }
				  
				
			}
		}
		System.out.println("count :"+count+" count1:"+count1+" count2:"+count2);
		count =count2+(str2.length()-count1);
	    return count;
	} 
}
