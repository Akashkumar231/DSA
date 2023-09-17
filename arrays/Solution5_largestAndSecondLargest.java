package com.arrays;

public class Solution5_largestAndSecondLargest {

	public static void printLargestAndSecondLargest(int [] array) {
		
		int largest = Integer.MIN_VALUE;
		
		int secondLargest = Integer.MIN_VALUE-1;
		
		for(int i = 0 ; i< array.length ;i++) {
			
			if(largest < array[i]) {
				
				secondLargest = largest;
				
				largest = array[i];
				
			}else if ( secondLargest < array[i]) {
				
				secondLargest = array[i];
				
			}
		}
		
		largest-=1;
		secondLargest-=1;
		System.out.print("Largest :  " + largest + "  Second Largest : " + secondLargest);
		
	}
	
	public static void main(String [] args) {
		
		printLargestAndSecondLargest(new int [] {3,4,5,2});
		
	}
	
}
