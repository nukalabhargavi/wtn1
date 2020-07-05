package com.wipro.arrays;

public class Aproblem10 {
public static void main(String[] args) {
	int a[]=new int[] {1,24,6,45,66,90,7,3};
	int n=a.length;
	int i=0,j=n-1;
	while(i<j)
	{
		while(a[i]%2==0&&i<j)
			i++;
		while(a[j]%2==1&&i<j)
			j--;
		if(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
	}
	for(int k:a)
		System.out.print(k+" ");
	
}
}
