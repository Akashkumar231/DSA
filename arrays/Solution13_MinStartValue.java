package com.arrays;

public class Solution13_MinStartValue {

	public static int getMinStartValue(int [] array) {
		
		int sum = 1 ; 
		int starting = 1;
		
		for(int value : array) {
			
			sum+=value;
			
			if(sum<=0) {
				
				starting = starting +1 - sum;
				sum=1;
			}
			
		}
		
		return starting;
	}
	
	public static void main(String [] args) {
		
		System.out.print(getMinStartValue(new int [] {-3,2,-3,4,2,-5,-10,15}));
		
		
	}
	
}
