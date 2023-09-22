package com.string;

public class Solution04_CheckValidPalindrome {

	/*
	 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 
	 */
	
	public static boolean checkPalindrome(StringBuilder sb) {
		
		System.out.println(sb);
		
		int left = 0 ; 
		int right = sb.length()-1;
		
		while(left <  right) {
			
			if(sb.charAt(left) != sb.charAt(right))
			{
				System.out.println(sb.charAt(left) + " " + sb.charAt(right));
				return false;
				
			}
			left++;
			right--;
			
		}
		
		return true;
		
	}
	
public  static boolean isPalindrome(String s) {
    
	String newString = s.toLowerCase();
	
	StringBuilder res = new StringBuilder("");
	
	int index = 0; 
	
	while(index < s.length()) {
		
		if(97<= newString.charAt(index) && newString.charAt(index)<=122 || newString.charAt(index) <= 48 && newString.charAt(index)>=57) {
			
			char character = (char)newString.charAt(index);
			
			 res.append(character);
		}
		
		index++;
		
	}
	
	System.out.println(res);
	
	return checkPalindrome(res);
	
    }
	
	public static void main(String [] args) {
		
	String 	s = "A man, a plan, a canal: Panama";
		 
		System.out.println(isPalindrome(s));
		
	}
	
}
