package com.recursion;
import java.util.ArrayList;
public class Solution24_getMazePaths {
	
	public static ArrayList<String>  getMazePaths(int srcRow , int srcCol , int destRow , int destCol){
		
		if(srcRow == destRow && srcCol == destCol) {
			
			ArrayList<String>  paths = new ArrayList<>();
			paths.add("");
			return paths;
			
		}
		
		if(srcRow > destRow ||  srcCol>destCol) {
			
			return new ArrayList<String>();
			
		}
		
	   ArrayList<String>  hPaths = getMazePaths(srcRow,srcCol+1,destRow , destCol);	
	   ArrayList<String>  vPaths = getMazePaths(srcRow+1,srcCol,destRow , destCol);
	   
	   
	   
	   ArrayList<String>  res = new ArrayList<>();
	   
	   for(String s : hPaths) {
		   
		   res.add("h"+s);
		   
	   }
	   
        for(String s : vPaths) {
		   
		   res.add("v"+s);
		   
	   }

		return res;
		
	}
	
	public static void main(String [] args) {
		
		
	}

}
