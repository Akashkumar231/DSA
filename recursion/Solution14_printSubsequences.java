package com.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution14_printSubsequences {
	
	static private  List<String> result ;

	
	// Expectation 
	
	public static void printSubSequences1(String input, int index, String output) {
		
		// base condition
		
		if(index == input.length()) {
			
			// remaining work.
			
			System.out.print(output + " ");
			
			return;
			
		}
		
		
		// faith 
		
		String yes_choice= output + input.charAt(index); // for including in the output String
		
		printSubSequences1(input,index+1,yes_choice);
		
		String no_choice = output;
		
		printSubSequences1(input,index+1,no_choice);
		
	}
	
	public static void  printSubSequences2(String input, int index, String output){
		

		// base condition
		
		if(index == input.length()) {
			
			// remaining work.
			
			result.add(output);
			
			return;
			
		}
		
		
		// faith 
		
		String yes_choice= output + input.charAt(index); // for including in the output String
		
		printSubSequences2(input,index+1,yes_choice);
		
		String no_choice = output;
		
		printSubSequences2(input,index+1,no_choice);
		

	}
	
	
	
	public static void main(String[] args) {
		
		result = new ArrayList<>();
		
		String string = "abc";
		
		printSubSequences2(string,0,"");
		
		Collections.sort(result);
		
		System.out.println(result);

	}

}
