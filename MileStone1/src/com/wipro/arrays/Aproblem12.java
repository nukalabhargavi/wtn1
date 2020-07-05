package com.wipro.arrays;

public class Aproblem12 {
public static void main(String[] args) {
	int a[]=new int[] {1,65,7};
	int b[]=new int[] {43,6,90};
	int c[]=new int[2];
	int j=0;
	c[j++]=a[1];
	c[j++]=b[1];
	for(int i=0;i<2;i++)
		System.out.print(c[i]+" ");
}
}
