package com.recursion;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Solution15_getSubSequences {

	
	public static List<String> getSubSequences(String input, int index){
		
		// base condition 
		
		if(index == input.length()) {
			
			List<String> ans = new ArrayList<>();
			ans.add("");
			return ans;
			
		}
		// Faith : Recursive Call
		
		List<String> ans = getSubSequences(input,index+1);
		
		int n = ans.size();
		
		for(int i=0 ; i< n ;i++) {
			
			String newString = input.charAt(index)+ans.get(i);
			
			ans.add(newString);
			
		}
		
		return ans;
		
		
	}
	
	public static void main(String [] args) {
		
		String string = "abc";
		
		 List<String> finalAns = getSubSequences(string,0);
		 Collections.sort(finalAns);
		 
		 System.out.println(finalAns);
		
	}
	
}
