package com.arrays;

public class Solution9_SumOfAllOddLengthSubArrays {
	
	public static int sumOfAllOddLengthSubArrays(int [] array ) {
		
		int ans = 0;
		
		for(int left = 0 ; left< array.length ;left++) {
			
			int sum = 0;
			
			for(int right = left ; right< array.length ;right++) {
				
				sum+=array[right];
				
				if((right - left + 1 ) % 2 == 1) {
					
					ans+=sum;
					
				}
				
			}
			
		}
		
		return ans;
	}
	
	public static void main(String [] args) {
		
		System.out.println(sumOfAllOddLengthSubArrays(new int [] {1,4,2,5,3}));
		
	}

}
