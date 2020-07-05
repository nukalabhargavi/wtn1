package com.wipro.flowcontrolstatements;

public class Flproblem11 {
public static void main(String[] args) {
	for(int i=23;i<=57;i++)
	{
		if((i&1)==0)
		{
			System.out.println(i+" even");
		}
		else
			System.out.println(i+" odd");
	}
}
}
