package com.arrays;

public class Solution10_FindHighestAltitude {
	
	public static int findHighestAltitude(int [] array) {
		
		int height = 0 ;
		
		int climb = 0 ;
		
		for(int i = 0 ; i < array.length ;i++) {
			
			climb += array[i];
			
			height = Math.max(climb, height );
			
		}
	
		
		return height ;
		
	}

	public static void main(String [] args) {
		
		System.out.println(findHighestAltitude(new int [] {-5,1,5,0,-7}));
		
	}
	
}
