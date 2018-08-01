package com.java;

public class RevrseString {
static String s="mahesh";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String rev="";
for(int i=0;i<s.length();i++)
{
	rev=s.charAt(i)+rev;
	System.out.println(rev);
}
	}

}
