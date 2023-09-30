package com.recursion;

import java.util.ArrayList;

public class Solution23_getStairPaths2 {
 
	public static ArrayList<String> getStairPaths(int n){
		
		if(n < 0) {
			//Nagative base case
			ArrayList<String>  res =new ArrayList<String>();
			return res;
			
			
		}else if(n==0){
			
			ArrayList<String> res  = new ArrayList<String>();
			res.add("");
			return res;
		}
		
		ArrayList<String> firstStairPaths1 = getStairPaths(n-1);
		ArrayList<String> firstStairPaths2 = getStairPaths(n-2);
		ArrayList<String> firstStairPaths3 = getStairPaths(n-3);
		
		ArrayList<String>  res = new ArrayList<String>();
		
		for(String path : firstStairPaths1) {
			
			res.add(path + "1");
			
		}
		
        for(String path : firstStairPaths2) {
			
			res.add(path + "2");
			
		}

        for(String path : firstStairPaths3) {
	
	          res.add(path + "3");
	
         }
		
        return res;
		
	}
	
	public static void main(String[] args) {
		System.out.print(getStairPaths(4));

	}

}
