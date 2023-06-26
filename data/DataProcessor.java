package com.example.data;
import java.util.*;

public class DataProcessor{

Scanner sc= new Scanner(System.in);

public static void getdata(int []a,int n){
Scanner sc=new Scanner(System.in);
int s=0;
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
s+=a[i];}
System.out.println(s);
}
}
