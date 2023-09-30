package com.recursion;

public class Solution4_FactorialNumber {
 
   public  static long factorial(int N){
        
        
    //  base condition
      
      if( N <= 1){
          
          return 1l;
          
      }
      
    //   faith : recusive call
     
    long small_Ans = factorial(N-1);
    
    //   Remaining Work
    
    long big_Ans = N * small_Ans;
    
    return big_Ans;
      
      
    }
	
	public static void main(String[] args) {
		
		System.out.println(factorial(5));
		

	}

}
