package com.wipro.exceptionhandling;
import java.util.*;
public class exceptp1 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements of array");
		try {
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}		
		System.out.println("Enter the index of the array element you want to access");
		int k=sc.nextInt();
		System.out.println(a[k]);
		}
		catch(ArrayIndexOutOfBoundsException aioobe)
		{
			aioobe.printStackTrace();
		}
		catch(InputMismatchException ne)
		{
			System.out.println(ne);
		}
		finally {
			
		}
}
}
