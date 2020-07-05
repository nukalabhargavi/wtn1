package com.wipro.flowcontrolstatements;

public class Flproblem12 {
public static void main(String[] args) {
	int i=Integer.parseInt(args[0]);
	int c=0;
	for(int k=2;k<i/2;k++)
	{
		if(i%k==0)
			c++;
	}
	if(c>0)
		System.out.println("not prime");
	else
		System.out.println("prime");
}
}
