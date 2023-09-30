package com.recursion;

public class Solution11_checkSorted {

	public static boolean isSorted(int [] array , int index) {
		
		
		//  base condition
		
		if(index >= array.length-1 ) {
			
			return true;
			
		}
		
		// remaining work
		
		if(array[index]>array[index+1]) {
			
			return false;
		}
		
		
		return isSorted(array,index+1);
		
	}
	
	
	
	public static void main(String [] args) {
		
		int [] array = new int []{1,2,3,4,5};
		
		System.out.print(isSorted(array,0));
		
		
	}
	
}
