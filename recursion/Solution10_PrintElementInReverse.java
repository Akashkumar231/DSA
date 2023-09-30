package com.recursion;

public class Solution10_PrintElementInReverse {

	
	public static void printArray(int [] array , int index) {
		 
		 
		 // base condition
		 
		 if( index == 0 )
		
		 {
			 
			 System.out.print(array[index]+ " ");
			 
			 return ;
			 
			 
		 }
		 
		 
		// remaining work
		 
				 System.out.print(array[index]+ " ");
		 
		 // faith : recursive call
		 
		 printArray(array,index-1);
		 
		 
		 
		 
		 
	 }
	 
	 public static void main(String [] args) {
		 
		 int [] array = new int [] {10,20,30,40,50};
		 
		 printArray(array,array.length-1);
		 
	 }
	
}
