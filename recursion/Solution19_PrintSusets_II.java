package com.recursion;

import java.util.List;
import java.util.ArrayList;

public class Solution19_PrintSusets_II {
	
	static List<List<Integer>> result;
    
	//Expectation
	
	public static void printSubsets_II(int [] array , int index  , List<Integer> output)
	{
		
		// Base Condition.
		
		if(index == array.length) {
			
			// result.add(output); // shallow copy
			result.add(new ArrayList<>(output)); // deep copy
			return;
			
		}
		
		
		
		// Faith : Recursion.
		
		// yes call
		
		output.add(array[index]);
		printSubsets_II(array,index+1,output);
		output.remove(output.size()-1);
		
		// Remaining Work.
		
		if(output.size()>0 && output.get(output.size()-1)==array[index] ) {
			return; // yes -> no on duplicates will be restricte.
		}
		
		 // no call
		
		printSubsets_II(array,index+1,output);
		
		
		
		
	}
	public static void main(String[] args) {
	 
	  int [] nums = new int[] {10,20,20};
	  result = new ArrayList<>();
	  List<Integer> output = new ArrayList<>();
	  printSubsets_II(nums,0,output);
	  System.out.println(result);
		

	}

}
