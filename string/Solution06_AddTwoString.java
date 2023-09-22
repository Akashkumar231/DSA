package com.string;

/*
 * Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

 

Example 1:

Input: num1 = "11", num2 = "123"
Output: "134"

Example 2:

Input: num1 = "456", num2 = "77"
Output: "533"

Example 3:

Input: num1 = "0", num2 = "0"
Output: "0"

 */
public class Solution06_AddTwoString {

	 public static String addStrings(String num1, String num2) {
		 
		 StringBuilder res = new StringBuilder();
		 
		 int pointer1 = num1.length()-1;
		 int pointer2 = num2.length()-1;
		 int carry = 0;
		 
		 while(pointer1 >= 0 || pointer2 >=0 || carry>0) {
			 
			 int d1 =  (pointer1>=0) ? num1.charAt(pointer1)-'0' : 0 ;
			 
			 int d2  = (pointer2>=0) ? num2.charAt(pointer2) - '0': 0 ;
			 
			 int sum = d1 + d2 + carry;
			 
			 carry = sum /10;
			 
			 res.append(sum%10);
			 
			 pointer1--;
			 pointer2--;
			 
		 }
	        
		 
		 return res.reverse().toString();
		 
	    }
	
	public static void main(String [] args) {
		
	String	num1 = "11", num2 = "123";
	
	System.out.println(addStrings(num1 , num2));
		
		
		
	}
	
}
