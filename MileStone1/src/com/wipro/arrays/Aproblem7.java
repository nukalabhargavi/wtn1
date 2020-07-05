package com.wipro.arrays;
import java.util.Arrays;
public class Aproblem7 {
public static void main(String[] args) {
	int a[]=new int[] {1,3,56,12,3,6,56};
	Arrays.sort(a);
	int b[]=new int[a.length];
	int j=0;
	for(int i=0;i<a.length;i++)
	{
		if(i!=a.length-1) {
		if(a[i]!=a[i+1]) {
			b[j++]=a[i];
		}
		}
		else {
			b[j++]=a[i];
		}
			
	}
	for(int i=0;i<j;i++)
	{
		a[i]=b[i];
		System.out.print(a[i]+" ");
	}

}
}
