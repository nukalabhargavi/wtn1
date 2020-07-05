package com.wipro.flowcontrolstatements;

public class Flproblem16 {
public static void main(String[] args) {
	int i=Integer.parseInt(args[0]);
	int k=i,rev=0;
	while(k!=0)
	{
		int r=k%10;
		rev=rev*10+r;
		k=k/10;
	}
	System.out.println(rev);
}
}
