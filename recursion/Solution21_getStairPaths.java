package com.recursion;
import java.util.List;
import java.util.ArrayList;
public class Solution21_getStairPaths {
  
	private static List<String>  result = new ArrayList<>();
	
//	Expectation
	
	public static void printStairsPaths(int n , String input) {
		
		if(n == 0) {
			
			result.add(input);
			return;
			
		}
		
		if(n<0) {
			
			return;
		}
		
		printStairsPaths(n-1,input+1);
		printStairsPaths(n-2,input+2);
		printStairsPaths(n-3,input+3);
		
		return ;
		
	}
	
	public static void main(String [] args) {
		
		int n =4;
		printStairsPaths(n,"");
		System.out.print(result+   "                    " +  result.size());
		
		
		
	}
	
	
}
