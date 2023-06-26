package com.example.strings;

public class StringUtils{
public static void reverse(String s){
	if(s.length()==0) return;

	reverse(s.substring(1));
	System.out.print(s.charAt(0));
}
}
