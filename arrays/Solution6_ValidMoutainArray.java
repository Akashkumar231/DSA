package com.arrays;

public class Solution6_ValidMoutainArray {

public boolean validMountainArray(int[] arr) {
        
        if(arr.length < 3 || arr[0]>= arr[1]){

          return false;

        }
        

        int index = 0 ;
         
         while(index+1 <  arr.length){
           

           if(arr[index] == arr[index+1]){

               return false;

           }

           if(arr[index] > arr[index+1]){

               break;

           }

          index++;

         }

         if(index == arr.length-1){

             return false;

         }

             
         while(index+1 <  arr.length){
          
            if(arr[index] == arr[index+1]){

               return false;

           }

           if(arr[index] < arr[index+1]){

               break;
               
           }

         


           index++;

         }

         return index == arr.length-1;
    }
	
}
