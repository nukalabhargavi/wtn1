package com.wipro.arrays;

public class Aproblem8 {
public static void main(String[] args) {
	int a[]=new int[] {10,3,6,1,2,7,9};
	int n=a.length,i6=0,i7=0,sum=0;
	for(int i=0;i<n;i++)
	{
		if(a[i]==6)
			i6=i;
		if(a[i]==7)
			i7=i;
	}
	if(i6<i7)
	{
		for(int j=0;j<n;j++)
		{
			if(j>=i6&&j<=i7)
				continue;
			sum+=a[j];
		}
	}
	else
	{
		for(int j=0;j<n;j++)
			{sum+=a[j];
			
			}
			
	}
	System.out.println("sum is:"+sum);
}
}
