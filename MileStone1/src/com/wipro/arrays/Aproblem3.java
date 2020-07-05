package com.wipro.arrays;

public class Aproblem3 {
public static void main(String[] args) {
	int a[]=new int[] {1,31,223,2};
	int k=3,f=0;
	for(int i=0;i<a.length;i++)
	{
		if(k==a[i])
			{System.out.println(i);
			f=1;
			break;
			}
	}
	if(f==0)
		System.out.println("-1");
}
}
