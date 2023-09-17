package com.arrays;

import java.util.Arrays;

public class Solution11_SuffixSum {

	public static int [] getSuffixSum(int [] arrays) {
		
		int length = arrays.length;
		int [] result = new int [length];
		
		result[length-1]=arrays[length-1];
		
		for(int idx=length -2 ; idx>=0 ; idx--) {
			
			result[idx]= result[idx+1]+arrays[idx];
			
		}
		
		
		
		return result;
		
	}
	
	public static void main(String [] args) {
		
		System.out.println(Arrays.toString(getSuffixSum(new int [] {1,2,3,4} )));
		
	}
	
}
