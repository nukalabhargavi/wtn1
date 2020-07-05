package com.wipro.arrays;

public class Aproblem2 {
public static void main(String[] args) {
	int a[]=new int[] {1,3,1,54,234};
	int h=a[0],l=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(h<a[i])
		{
			h=a[i];
		}
		if(l>a[i])
			l=a[i];
	}
	System.out.println("The minimum value is "+l+" maximum value is "+h);
}
}
