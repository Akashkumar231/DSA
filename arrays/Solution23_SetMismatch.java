package com.arrays;

import java.util.Arrays;

public class Solution23_SetMismatch {
	
	public static int [] getSetMismatch(int [] nums) {
		
		int [] res = new int [2];
		
		int missing = 0;
		
		int duplicate = 0;
		
		int n = nums.length;
		
		for(int i = 0 ; i< n ;i++) {
			
			int original = nums[i] % (n+1);
			
			nums[original-1]+=(n+1);
			
			
		}
		
	
		
		for(int i = 0 ; i< n ;i++) {
	
            int freq = nums[i]/(nums.length+1);
			
			if(freq < 1) {
				
			missing = i+1;
				
			}else if(freq>1) {
				
				duplicate = i+1;
				
			}
	
		}

		
		res[0]=duplicate;
		
		res[1]=missing;
		
		return res;
		
	}
	
	public static void main(String [] args) {
		
		int [] nums = {1,2,2,4};	
		
		int [] res = getSetMismatch(nums);
		
		System.out.println(Arrays.toString(res));
		
		
	}

}
