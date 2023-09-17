package com.arrays;

import java.util.Arrays;

public class Solution2_FirstAndLastIndex {

	  public static int[] searchRange(int[] nums, int target) {
	        
	        int [] result = new int[2];
	         
	        result[0] = -1 ;
	        result[1] = -1 ;

	        for(int i = 0 ; i< nums.length ; i++){
	        
	          if(nums[i]== target && result[0]==-1)
	          
	          {
	           
	             result[0]=result[1]=i;

	          }

	          if(nums[i]==target)
	          
	          {

	              result[1]=i;
	          }

	        }
	         
	         return result;

	    }
	  
	  public static void main(String [] args) {
		  
		  int [] arr = searchRange(new int [] {5,7,7,8,8,10} , 8);
		  System.out.print(Arrays.toString(arr));
		  
	  }
}
