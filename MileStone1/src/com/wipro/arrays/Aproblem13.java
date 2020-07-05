package com.wipro.arrays;

public class Aproblem13 {
public static void main(String[] args) {
	if(args.length<4)
		System.out.println("Please enter 4 integer numbers");
	else {
	int a[][]=new int[2][2];
	int k=0;
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			a[i][j]=Integer.parseInt(args[k++]);
		}
	}
	int b[][]=new int[2][2];
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			b[i][j]=a[2-i-1][2-j-1];
		}
	}
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}
	}
}
}
