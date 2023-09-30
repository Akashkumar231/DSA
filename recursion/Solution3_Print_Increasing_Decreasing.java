package com.recursion;

public class Solution3_Print_Increasing_Decreasing {
    
	public static void print_Increasing_Decreasing(int number) {
		
		if(number == 0) {
			
			return ;
			
		}
		
		// remaining work
		
		System.out.print(number + " "); 
		
		// faith : recursion call
		
		print_Increasing_Decreasing(number-1);
		
		// remaining work
		
		System.out.print(number + " "); 
		
	}
	
	public static void main(String [] args) {
		
		print_Increasing_Decreasing(5);
		
	}
	
}
