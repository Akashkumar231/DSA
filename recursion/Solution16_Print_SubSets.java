package com.recursion;

import java.util.List;

import java.util.ArrayList;

public class Solution16_Print_SubSets {

	private static List<List<Integer>> result;
	
	public static void printSubsets(int [] input, int index , List<Integer> output)
	
	{
		
		// base Condition 
		
		if(index == input.length) {
			
			//Remaining Work
			
			result.add(output);                  // Shallow coph
			
			result.add(new ArrayList<>(output)); //  deep copy
			
			return;
		}
		
		// Faith : recursion call
		
		// yes call
		
		output.add(input[index]);               // Yes
		
		printSubsets(input,index+1,output);
		output.remove(output.size()-1);         // Backtracking (remove)
		
		// no call
		
		printSubsets(input,index+1,output);
		
		
		
	}
	
	public static void main(String[] args) {
		
    result = new ArrayList<>();

	List<Integer> output = new ArrayList<>();
	
	printSubsets(new int [] {10,20,30},0,output);
	
	System.out.println(result);
	
		
	}

}
