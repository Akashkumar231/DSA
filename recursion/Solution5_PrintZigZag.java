package com.recursion;

public class Solution5_PrintZigZag {

	public static void printZigZag(int N) {
		
		// base condition
		
		if(N == 0) {
			
			return;
			
		}
		
		// remaining work
		
		System.out.print(N+ " ");
		
		// faith : Recursive call
		
		printZigZag(N-1);
		
		// reamining work
		
		System.out.print(N+ " ");
		
		// faith : Recursive Call
		
		printZigZag(N-1);
		
		// Remaining work.
		
		System.out.print(N+ " ");
		
		
		return;
		
	}
	
	public static void main(String [] args) {
		
		Solution5_PrintZigZag.printZigZag(3);
		
	}
	
	
}
