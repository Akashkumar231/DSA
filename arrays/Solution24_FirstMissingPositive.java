package com.arrays;

public class Solution24_FirstMissingPositive {
	
     public static int firstMissingPositive(int[] nums) {
        
        int n = nums.length;

        for(int i = 0 ; i< n ; i++){

           if(nums[i] <0 || nums[i] > nums.length){

              nums[i] = 0 ;


           }


        }
           
           for(int index = 0 ; index<n ; index++){

               int original = nums[index] % (n+1);
               
               if(original > 0){

                  nums[original-1] += (n+1);


               }
           }

         // smallest missing +ve integer

         for(int idx = 0 ; idx < n ; idx++){

            int freq = nums[idx] / (n+1);

            if(freq==0)

            return idx+1;


         }    
         

         return (n+1);

           }

     public static void main(String [] args) {
    	 
    	 
    	 
     }

 
}
