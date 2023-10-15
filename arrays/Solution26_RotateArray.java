package com.arrays;

import java.util.Arrays;
import java.util.List;

public class Solution26_RotateArray {
	
	 public static void rotateArr(int arr[], int d, int n)
	    {
	 
		 
	       for(int i  = 1 ; i<= d ; i++){
	           
	           int temp = arr[0];
	           
	           
	           for( int j = 1 ; j< n ; j++){
	               
	               arr[j-1]= arr[j];
	               
	           }
	           
	           arr[n-1]= temp;           
	       }
	       
	       
	       
	    }
	
	 
	       
	 
	public static void main(String [] args) {
		
	int 	arr[] = {2,4,6,8,10,12,14,16,18,20};
	
	rotateArr(arr,3,arr.length);
	
	System.out.println(Arrays.toString(arr));
	
	
	
	}

}
