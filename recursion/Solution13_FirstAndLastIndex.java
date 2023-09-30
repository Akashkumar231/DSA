package com.recursion;

import java.util.Arrays;

public class Solution13_FirstAndLastIndex {
    
	private static int [] ans = {-1,-1};
	
	public static void  getFirstAndLast(int [] array , int index, int target) {
		
		if(array.length == index) {
			
			return ;
			
		}
		
		getFirstAndLast(array, index+1,target);
		
		if(array[index]== target) {
			
		  if(ans[0]==-1) {
			  ans[0]=ans[1]=index;
		  }
		  else {
			  ans[0]=index;
		  }
			
		}
		
	}
	
	public static void main(String[] args) {
		
		
		getFirstAndLast(new int[] {30,20,40,20,20,50},0,100);
		System.out.print(Arrays.toString(ans));
		
		
	}
	
}
