package com.recursion;

public class Solution1_Print_Decreasing {
   
	public static void printDecreasing(int N) {
		
  //base condition
        
        if(N==0){
        
        return ;
        
        }
        
        // remaining work
        
        System.out.print(N + " ");
        
        // faith : recusive call
        
        printDecreasing(N-1);
		
		
		
	}
	
	public static void main(String [] args) {
		
		printDecreasing(5);
		
	}
	
}
