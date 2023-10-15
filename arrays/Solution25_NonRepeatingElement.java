package com.arrays;

public class Solution25_NonRepeatingElement {
	
	public static int firstNonRepeating(int arr[], int n) 
    { 
        
        
        
        
        for(int indx = 0 ; indx< n ; indx++){
            
            boolean isRepeated = false;
            
            for(int ind1  = 0 ; ind1 < n ; ind1++){
                
                if(arr[indx] == arr[ind1] && indx!=ind1){
                 
                    isRepeated = true;
                }
                
                
                
            }
            
            if(isRepeated == false){
            
                return arr[indx];
                
            }
            
            
        }
        
        return 0;
    }
	public static void main(String [] args) {
		
	int [] arr = new int[] {-1 ,-17, -12, 8, 16, -17 ,-13 ,-14 ,-3 ,-6 ,-5, -11, -10, -12, -5, 19, -17 ,-5 ,-1 ,12};	
		
	System.out.println(firstNonRepeating(arr,arr.length))		;
	}

}
