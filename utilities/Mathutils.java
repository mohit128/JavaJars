package com.example.utilities;

public class Mathutils{
 private int n;
  public static int fact(int n){
	if(n<2)return 1;
		
	return n*fact(n-1);
}
}
