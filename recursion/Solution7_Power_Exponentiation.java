package com.recursion;

public class Solution7_Power_Exponentiation {

	public static double pow(double x , long n) {
		
		// base condition
		 
		if( n==0 ) {
			
			return 1;
			
		}
		
		// Faith : Recursion 
		
		double samllans = pow(x,n-1);
		
		// Remaining work
		
		double bigans =  x * samllans ;
		
		
		return bigans;
		
	}
	
	public static double myPow(double x , int n) {
		
		if(n<0) {
			
			return 1/pow(x,-1l*n);
			
		}
		
		return pow(x,n);
		
	}
	
	public static void main(String [] args) {
		
		double x = 2.0;
		int n = -5;
		
		if(n<0) {
			
			System.out.println(myPow(x,n));
			
		}
		
		System.out.println(myPow(x,n));
		
	}
	
	
}
