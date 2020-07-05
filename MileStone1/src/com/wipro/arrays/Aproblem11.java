package com.wipro.arrays;

public class Aproblem11 {
public static void main(String[] args) {
	int a[]=new int[]{1,4,1,1,4,4,1};
	int f=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]!=1 && a[i]!=4)
		{
			f=1;
			break;
		}
	}
	if(f==0)
		System.out.println("True");
	else
		System.out.println("False");
}
}
