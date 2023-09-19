package com.string;

//https://leetcode.com/problems/reverse-words-in-a-string/description/

public class Solution1_reverseWords {

	public static String reverseWords(String s) {
		
		String [] words = s.trim().split("\s+");
		
		//trim: leading & trailing spaces : discard
		//split on multiple spaces: single split.
		
		StringBuilder res = new StringBuilder();
		
		for(int idx = words.length-1 ; idx>= 0 ; idx--) {
			
			
			if(idx < words.length-1)
			{
				res.append(" ");
				
			}
			
			res.append(words[idx]);
			
		}
		
		return res.toString();
		
	}
	
	public static void main(String[] args) {
	
		

	}

}
