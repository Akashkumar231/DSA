package com.recursion;

public class Solution6_Fibbonaccii {
	
	public static int getFibbo(int n ) {
		
		// base condition.
		
		if(n<=1) {
			
			return n;
			
		}
		 // faith : Recursive Calls
		
		int smallans1 = getFibbo(n-1);
		
		int smallans2 = getFibbo(n-2);
		
		// Remaining Work
		
		int bigans = smallans1 + smallans2;
		
		return bigans ;
		
	}

	public static void main(String[] args) {
		
		System.out.println(getFibbo(5));

	}

}
