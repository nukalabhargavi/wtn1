package com.wipro.exceptionhandling;
import java.util.*;
public class MathOperation {
public static void main(String[] args)throws ArrayIndexOutOfBoundsException,NumberFormatException,ArithmeticException{
	int a[]=new int[5];
	int s=0,avg=0;
	try {
	for(int i=0;i<5;i++)
	{
		a[i]=Integer.parseInt(args[i]);
		s+=a[i];
	}
	avg=s/5;
	System.out.println("sum of all 5 integers is:"+s);
	System.out.println("Average of all 5 integers is"+avg);
	System.out.println("The results are displayed above");
	}catch(Exception e)
	{
		System.out.println(e);
	}
}
}
