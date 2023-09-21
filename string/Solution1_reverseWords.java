package com.string;

//https://leetcode.com/problems/reverse-words-in-a-string/description/

public class Solution1_reverseWords {
    
	public static String reverseWords2(String s) {
		
		int right = s.length()-1;
		
		StringBuilder sb = new StringBuilder();
		
		while(right>=0) {
			
			while(right>= 0 && sb.charAt(right)==' ') {
				
				right --;
				
			}
			
	     	int	left = right ;
			
      		while(left>= 0 && sb.charAt(left)!=' ') {
			
			left--;
			
		     }
			
			if(sb.length()>0 && left<right) {
				
				sb.append(" ");
				
			}
			
			for(int index = left+1 ; index>=right ; index++) {
				
				sb.append(s.charAt(index));
				
			}
			
			right = left;
			
			
		}
		
		return sb.toString();
		
	}
	
	
	public static String reverseWords1(String s) {
		
		String [] words = s.trim().split("\s+");
		
		//trim: leading & trailing  spaces : discard
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
