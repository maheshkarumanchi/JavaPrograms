package com.java;
import java.util.Scanner;


public class PrimeNumber {
	public static void main(String[] args) {
		
		for(int i=2;i<=100;i++)
		{
			if(!((i%2)==0))
			{
				System.out.println("prime number is:"+i);
			}
		}
	}

}