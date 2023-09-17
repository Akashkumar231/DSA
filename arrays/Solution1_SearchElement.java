package com.arrays;

//Given an integer array and another integer element. The task is to find if the given element is present in array or not.



public class Solution1_SearchElement {

	 
	public  static int search(int arr[],  int X)
	    {
	        
	       
	        
	        for(int i = 0; i< arr.length ;i++){
	            
	            
	            if(arr[i]==X)
	            {
	                
	                return i;
	                
	            }
	            
	            
	        }
	        
	        return -1;
	        
	    }
	    
	
	public static void main(String [] args) {
		
		
		
		
	}
	
}
