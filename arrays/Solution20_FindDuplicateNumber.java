package com.arrays;

import java.util.Arrays;

public class Solution20_FindDuplicateNumber {

	public static int getDuplicateNumber(int [] nums) {
		
		for(int i = 0 ; i< nums.length ;i++) {
			
			int original = nums[i]%(nums.length+1);
			
			nums[original]+=(nums.length+1);
			
		}
		
		System.out.println(Arrays.toString(nums));
		
		for(int i = 0 ; i< nums.length ;i++) {
			
			int freq = nums[i]/(nums.length+1);
			
			System.out.println(freq);
			
			if(freq > 1) {
			
				return i;
				
			}
			
			
		}
		return -1;
	}
	
	public static void main(String [] args) {
		
		int [] array = new int [] { 1,2,3,4,5,5,6,7,8 };
		
		System.out.print(getDuplicateNumber(array));
        
		
		
	}
	
}
