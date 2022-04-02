package com.siddharth.it;

import java.util.Iterator;

public class Practice {
	public static void main (String[]args) {
		
		String s1= "rohit";
		String s2 = "";
		char ch;
		

	
		
		
		 for (int i = 0; i < s1.length(); i++) {
//			System.out.println(i);
			 ch = s1.charAt(i);
			 s2 = ch+s2;
		}
	System.out.println(s2);
		
	}

}
