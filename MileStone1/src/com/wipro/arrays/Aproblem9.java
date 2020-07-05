package com.wipro.arrays;

public class Aproblem9 {
public static void main(String[] args) {
	int a[]=new int[] {1,3,10,8,78,10,10,5};
	int n=a.length,j=0;
	int b[]=new int[n];
	for(int i=0;i<n;i++)
	{
		if(a[i]!=10)
			b[j++]=a[i];
	}
	for(int i=0;i<n;i++)
	{
		System.out.print(b[i]+" ");
	}
}
}
