package com.arrays;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Solution14_FindPivotIndex {

public static int [] getSuffixSum(int [] arrays) {
		
		int length = arrays.length;
		int [] result = new int [length];
		
		result[length-1]=arrays[length-1];
		
		for(int idx=length -2 ; idx>=0 ; idx--) {
			
			result[idx]= result[idx+1]+arrays[idx];
			
		}
		
		
		
		return result;
		
	}

public static int[]  getPrefixSum(int [] array ) {
	
	
	
    for(int i = 1 ; i < array.length ;i++) {
    	
    	array[i]=array[i-1]+ array[i];
    	
    }
	
	return array;
	
}

   public static int getFindPivotIndex(int [] suffix , int [] prefix) {
	   
	   
	   int ansIndex = - 1;
	   
	   for(int i = 0 ; i< suffix.length ; i++) {
		   
		   if(suffix[i]==prefix[i]) {
			   
			   return i;
			   
		   }
		   
	   }
	   
	   
	   return ansIndex;
	   
   }

     public static void main(String [] args) {
    	 
    	 int [] suffix = getSuffixSum(new int [] {1,2,3,4} );
    	 int [] prefix = getPrefixSum(new int [] {1,2,3,4} );
    	 
    	 System.out.print(getFindPivotIndex(suffix,prefix));
    	 
     }

	
}
