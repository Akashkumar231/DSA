package com.arrays;

public class Solution12_HighestAltitude {

	public static int getHighestAltitude(int [] array) {
		
		int altitude= 0;
		
		int total=0;
		
		for(int i = 0 ; i< array.length ; i++) {
			
			
			total+=array[i];
			
			altitude= Integer.max(total, altitude);
			
		}
		
		return altitude;
		
	}
	
	public static void main(String [] args) {
		
		System.out.println(getHighestAltitude(new int  [] {-4,-3,-2,1,4,3,2,6,10,-20}));
		
	}
	
}
