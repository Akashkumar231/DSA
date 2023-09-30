package com.recursion;

public class Solution2_Print_Increasing {

	 public static void printNos(int N)
	    {
	       
	       // base condition
	       
	       if(N==0)
	       
	       {
	           
	           return;
	           
	       }
	       
	       
	       
	       // faith : Recursion Call
	       
	       printNos(N-1);
	       
	       
	       // Remaining work
	       
	       System.out.print(N + " ");
	       
	       
	    }
	 
	 public static void main(String [] args) {
		 
		 printNos(5);
		 
	 }
	
}
