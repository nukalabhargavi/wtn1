package com.wipro.flowcontrolstatements;

public class Flproblem13 {
public static void main(String[] args) {
	for(int i=10;i<=99;i++)
	{int c=0;
		for(int k=2;k<i/2;k++)
		{
			if(i%k==0)
				c++;
		}
		if(c>0)
			System.out.println(i+" not prime");
		else
			System.out.println(i+" prime");
	}
}
}
