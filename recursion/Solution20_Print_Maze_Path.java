package com.recursion;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution20_Print_Maze_Path {

	private static List<List<Integer>> result ;
	
	//Expeactation or Prototype of the Function
	
	public static void print_Maze_Path(int [][] matrix , int row , int col , List<Integer> path) {
		
	 // base condition
		
		if(row == matrix.length || col == matrix[0].length) {
			
			// This is the negative base case;
			return;
			
		}
		
		if(row == matrix.length-1 && col == matrix[0].length-1) {
			
			path.add(matrix[row][col]);// The destination value is also added
			result.add(new ArrayList<>(path)); //  deep copying
		     path.remove(path.size()-1); // backTracking step.

			return;
			
			
		}
             // remaining work
		    path.add(matrix[row][col]);
	        
		    // Faith : resucrion calls 
		    
		      //First Recursion call
		       
		     print_Maze_Path(matrix , row , col+1 , path); // right or Horizantal.
		    
		     
		     
		      // Second Recursion call
		     
		     print_Maze_Path(matrix, row+1 , col , path); // down or Vertical.
		     
		     //Most imp step
		     
		     path.remove(path.size()-1); // backTracking step.
		     
		        
	
	}
	public static void main(String[] args) {
		
		int [][] maze = new int [][] {{5,10},{15,20}};
	
		result = new ArrayList<>();
		
		List<Integer> path = new ArrayList<>();
		 
		print_Maze_Path(maze , 0 ,0 ,path);
		
		int row = result.size();
		int col = result.get(0).size();
		
		 maze = new int[row][col];
		 
		 for(int r = 0 ; r<row ; r++) {
			 
			 for(int c = 0 ; c<col ; c++) {
				 
				 maze[r][c]=result.get(r).get(c);
				 
				 
			 }
			 
			 
		 }
		
		System.out.println(result);
     
	}

}
