package com.recursion;

public class Solution17_getFirstIndex {
      
	
	// Expectation
	
	public static int getFirstIndex(int [] array, int index , int target) {
		
		// base condition
		
		if(index == array.length) {
			
			return -1;
		}
		
		
		//Reamining Work
		
		if(array[index]==target) {
			
			return index;
			
		}
		
		// Faith : Recursive Call
		
		int array_index = getFirstIndex(array,index+1,target);
		
		
	   return array_index;
		
		
		
	}
	
	 public static void main(String [] args) {
		 
		System.out.println(getFirstIndex(new int[] {4,4,9,4,4} ,0 , 10)) ;
		 
		 
	 }
	
}
