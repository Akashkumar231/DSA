package com.recursion;
import java.util.ArrayList;

public class Demo {

	public static ArrayList<String> getSubsequences(String str){
		
		if(str.equals("") == true) {
			
			ArrayList<String> res = new ArrayList<>();
			res.add("");
			return res;
			
			
		}
		
		ArrayList<String> sres = getSubsequences(str.substring(1));
		
		ArrayList<String> res = new ArrayList<String>();
		
		for(String s : sres) {
			
			res.add(s+"");
			
		}
		
          for(String s : sres) {
			
			res.add(str.charAt(0) + s);
			
		}
          
          return res;
		
	}
	
	public static void main(String [] args) {
		
		
//		System.out.print(getSubsequences("abc"));
		
		String str = "";
		
		System.out.print(str.charAt(0));
		
//		String str = "hei";
//		
//		str = str + 'a' + 'k' + 'a' + 's' + 'h'; 
//		
//		System.out.println(str);
		
		
		
//		int [] array = new int[] {22,56,23,65,89};
//		int [] result;
//		
//		int [] temp = new int [] {22,56,23,65,89};
//		
//		result = array;
//		
//		System.out.println(array);
//		System.out.println(result);
//		System.out.print(temp);
	}
	
}
