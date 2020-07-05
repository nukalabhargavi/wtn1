package com.wipro.arrays;

public class Aproblem1 {
public static void main(String[] args) {
	int a[]=new int[]{1,2,3,4,5};
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		sum+=a[i];
	}
	System.out.println("sum of elements of array "+sum);
	System.out.println("Average of elements of array "+(sum/a.length));
	
}
}
