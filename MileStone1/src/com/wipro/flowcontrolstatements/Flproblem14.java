package com.wipro.flowcontrolstatements;

public class Flproblem14 {
public static void main(String[] args) {
	int i=Integer.parseInt(args[0]);
	int k=i,s=0;
	while(k!=0)
	{
		int r=k%10;
		s+=r;
		k=k/10;
	}
	System.out.println(s);
}
}
