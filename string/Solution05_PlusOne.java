package com.string;

public class Solution05_PlusOne {

      public static int[] plusOne(int[] digits) {
        
        
    	  for(int index = digits.length-1 ; index>=0 ; index--){

              if(digits[index] == 9){
              
                digits[index]=0;

             } else{

                 digits[index]++;
                 return digits;
                

             }
          

        }

        int [] res = new int[digits.length+1];

        res[0]=1;

        return res;



    }

	
	public static void main(String [] args) {
		
		
		
	}
	
}
