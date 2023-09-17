package com.arrays;

public class Solution17_MajorityElements {

	public static int getMajorityElement(int [] array) {
		
		int majority = 0;
		int lead = 0;
		
		for(int index = 0 ; index< array.length ; index++) {
			
			if(array[index]==majority) {
				
				lead++;
				
				
			}else if( lead == 0) {
				
				majority = array[index];
				lead=1;
				
			}
			else {
				
				lead--;
			}
			
		}
		
		
		return majority;
		
		
		
	}
	
	public static void main(String[] args) {
		
		int [] array = new int[] {10,10,20,20,20,30,30,30,30,20,20,20,20};
        System.out.println("The majority elements in the array is " + getMajorityElement(array) );
	}

}
