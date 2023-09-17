package com.arrays;

import java.lang.Math;

public class Solution19_missingNumber {

	public static int missingNumber2(int [] nums) {
		
		int total = nums.length*(nums.length+1)/2;
		
		int sum = 0;
		
		for(int i  = 0 ; i< nums.length ; i++) {
			
			sum+=nums[i];
			
		}
		
		int num1 = Math.max(sum , total);
		
		int num2 = Math.min(sum , total);
		
		int diff = num1 - num2;
		
		return diff==0 ? nums.length : diff;
		
	}
	
	public static int missingNumber1(int [] nums) {
		
		int n= nums.length;
		
		for(int index = 0 ; index<n ; index++) {
			
			int original = nums[index] % (n+1);
			
			if(original < n) {
				
				nums[original] += (n+1);
				
			}
			
		}
		
		// find missing number
		
		for(int index = 0 ; index<n ; index++) {
			 
			
			int freq = nums[index] / (n+1);
			
			if(freq == 0) 
				return index;
			
		}
		
		return n;
		
	}
	
	public static void main(String [] args) {
		
		System.out.println(missingNumber2  (new int [] {4,0,3,2,1}));
		
	}
	
}
