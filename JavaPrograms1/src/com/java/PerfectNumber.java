package com.java;

public class PerfectNumber {
	static int num=1345;static String str1;
	public static void main(String[] args) {
	str1=Integer.toString(num);
	char[] ch=str1.toCharArray();
	int[] t1=new int[ch.length];
	for(int i=0;i<ch.length;i++)
	{
		t1[i]=(int)ch[i]-48;
		System.out.println(t1);
	}
	

}}
