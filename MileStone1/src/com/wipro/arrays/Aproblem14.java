package com.wipro.arrays;

public class Aproblem14 {
public static void main(String[] args) {
	if(args.length<9)
		System.out.println("Please enter 9 integer numbers");
	else {
	int a[][]=new int[3][3];
	int k=0,big=0;
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			a[i][j]=Integer.parseInt(args[k++]);
			if(a[i][j]>big)
				big=a[i][j];
		}
	}
	System.out.println("The biggest number in the given array is "+big);
	}
}
}
