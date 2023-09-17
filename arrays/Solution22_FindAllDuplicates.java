package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class Solution22_FindAllDuplicates {

	public static List<Integer>  getAllDuplicates(int [] nums){
		
List<Integer>  ans = new ArrayList<>();
		
	
		 for(int i = 0 ; i< nums.length ;i++) {
			
			int original = nums[i]%(nums.length+1);
			
			nums[original-1]+=(nums.length+1);
			
		}
       
		
		for(int i = 0 ; i< nums.length ;i++) {
			
			int freq = nums[i]/(nums.length+1);
			
			if(freq >0 ) {
			
			  ans.add(i+1);
				
			}
			
			
		}

	return ans;
	}
	public static void main(String [] args) {
		
		int [] nums  = new int[] {6,4,6,5,3,6,7,5,7};
		
		System.out.println(getAllDuplicates(nums));
	}
	
}
