package com.recursion;

public class Solution12_LargestElement {

	public static int getLargest(int [] array , int index) {
		
		
		// Base Condition
		
		if(array.length == index)
		
			return Integer.MIN_VALUE;
		
		// Faith : recursive calls
		
	       int smallans = getLargest(array, index+1);
		
		// Remaining work
		
		   int bigans = Math.max(array[index], smallans);
	
		
		return bigans;
	}
	
	public static void main(String [] args ) {
		
		int [] array = new int [] {30,40,50,20000000,10};
		System.out.println(getLargest(array,0));
		
	}
	
}
