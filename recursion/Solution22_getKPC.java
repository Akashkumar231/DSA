package com.recursion;

import java.util.ArrayList;

public class Solution22_getKPC {
	
	static String [] keypad = new String[] {".;" , "abc" ,"def" , "ghi" ,"jkl","mno" ,"pqrs","tu","vwx" ,"yz"};	

	public static ArrayList<String> getKPC(String s ){
		
		if(s.equals("")==true) {
			
			ArrayList<String>  baseRes = new ArrayList<String>();
			baseRes.add("");
			return baseRes;
			
		}
		
		ArrayList<String>  tres = getKPC(s.substring(1));
		ArrayList<String> res = new ArrayList<String>();
		
		char ch = s.charAt(0);
		
		for(int i = 0 ; i< keypad[ch-'0'].length() ; i++) {
			
			
			char letter = keypad[ch-'0'].charAt(i);
			
			for(String str : tres) {
				
				res.add(letter+str);
				
			}
			
		}
		
		return res;
		
	}
	
	public static void main(String [] args) {
		
	System.out.print(getKPC("456"));
	System.out.print(getKPC("456").size());
		
	}
	
}
