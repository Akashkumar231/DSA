package com.arrays;
import java.lang.Math;
public class Solution3_MinAndMax {
   
	public static int solve(int [] array) {
		
		int minimum = Integer.MAX_VALUE;
		int maximum = Integer.MIN_VALUE;
		
		for(int i = 0 ; i< array.length ;i++) {
			
			minimum = Math.min(minimum, array[i]);
			maximum = Math.max(maximum, array[i]);
			
		}
		
		return minimum+maximum;
		
	}
	
	public static void main(String [] args) {
		
		System.out.print(solve(new int [] {1,2,3,4}));
		
		
	}
	
}
