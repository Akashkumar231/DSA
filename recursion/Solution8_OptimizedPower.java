package com.recursion;

public class Solution8_OptimizedPower {
    
	public static double pow(double x , long n) {
		
		if( n == 0) {
			
			return 1;
					
		}
		
		if( n % 2 == 1) {
			
			double smallans = pow(x, n-1);
			double bigans = smallans *smallans * x;
			return bigans;
			
		}
		
		double smallans = pow(x, n-1);
		double bigans = smallans * smallans ;
		return bigans;
		
	}
	
public static double myPow(double x , int n) {
		
		if(n<0) {
			
			return 1/pow(x,-1l*n);
			
		}
		
		return pow(x,n);
		
	}
	
	public static void main(String[] args) {
		

	}

}
