package com.arrays;

public class Solution16_ProductExceptSelf {

	public static int [] getSuffixProduct(int [] array) {
		
		int length =array.length;
		
		int [] result = new int [length];
		
		for(int index = 0 ; index< length ; index++) {
			
			result[index]=  array[index] * ((index<0 ? 1 : array[index-1]));
			
		}
		
		return result;
		
	}
	
	public static int [] getPrefixProduct(int [] array) {
		
        int length =array.length;
		
		int [] result = new int [length];
		
		for(int index = length-1 ; index>= 0 ; index--) {
			
			result[index]=  array[index] * ((index>length-1 ? 1 : array[index+1]));
			
			
		}
		
		return result;
		
	}
	
	public static int[] getProductExceptSelf(int [] nums) {
		
		int [] prefix = getPrefixProduct(nums);
		int [] suffix = getSuffixProduct(nums);
		
		int n = nums.length;
		
		int [] answer = new int[n];
		
		for(int idex = 0 ; idex<n ; idex++) {
			
			int left = (idex>0)? prefix[idex-1]:1;
			int right = (idex < n-1) ? suffix[idex+1]:1;
			answer[idex]= left * right ;
			
			
		}
		
		return answer;
		
	}
	
	public static void main(String [] args) {
		

		
	}
	
}
