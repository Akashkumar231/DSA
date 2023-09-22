package com.string;

/*
 * 541. Reverse String II

Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

 

Example 1:

Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Example 2:

Input: s = "abcd", k = 2
Output: "bacd"
 

Constraints:

1 <= s.length <= 104
s consists of only lowercase English letters.
1 <= k <= 104
 */

public class Solution03_reverseStringtwo {

	
	public static void reverse(char[]  array, int left , int right) {
		
		while(left < right) {
		
		char temp = array[left];
		
		array[left] = array[right];
		
		array[right] = temp;
		
		left++;
		
		right--;
		
		}
		
	}
	public static String reverseStringtwo(String s , int k) {
		
		// characters less than k;
	
		char [] charray = s.toCharArray();
		
		int left = 0; 
		int right = left+k-1;
		
		while(right < charray.length) {
			
			reverse(charray,left , right);
			
			left = right + k + 1;
			
			right = left + k -1 ;
				
		
			
		}
		
		return String.valueOf(charray);
	}
	
	public static void main(String [] args) {
		
		System.out.println(reverseStringtwo("abcdef", 2));
		
	}
}
