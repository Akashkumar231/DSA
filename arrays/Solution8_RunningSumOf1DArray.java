package com.arrays;

import java.util.Arrays;

public class Solution8_RunningSumOf1DArray {

	public static void runningSumOf1DArray(int [] array ) {
		
		
		
	    for(int i = 1 ; i < array.length ;i++) {
	    	
	    	array[i]=array[i-1]+ array[i];
	    	
	    }
		
		System.out.print(Arrays.toString(array));
		
	}
	
	public static void main(String [] args) {
		
		runningSumOf1DArray( new int [] {1,1,1,1,1} );
		
	}
	
}
