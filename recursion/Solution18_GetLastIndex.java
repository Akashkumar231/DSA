package com.recursion;

public class Solution18_GetLastIndex {
	
	
    
	
	// Expectation
	
	public static int getLastIndex(int [] array, int index , int target) {
		
		// base condition
		
		if(index < 0) {
			
			return -1;
		}
		
	//Remaining Work
		
		if(array[index]==target) {
			
			return index;
			
		}
		
		
		
	    // Faith : Recursive Call
		
		int array_index = getLastIndex(array,index-1,target);
		
	
		
	
		
		
	   return array_index;
		
		
		
	}
	
	 public static void main(String [] args) {
		
		 int [] array = new int[] {2,3,4,4,9,4,4};
		 
		System.out.println(getLastIndex(array,array.length-1,4));
		 
		 
	 }

}
