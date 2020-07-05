package com.wipro.flowcontrolstatements;

public class Flproblem6 {
public static void main(String[] args) {
	int age=Integer.parseInt(args[1]);
	if(args[0]=="Female")
	{
		if(age>=1&&age<58) {
			System.out.println("percentage of interest is 8.2%");
		}
		else if(age>=58&&age<100)
		{
			System.out.println("percentage of interest is 9.2%");	
		}
	}
	else
	{
		if(age>=1&&age<58) {
			System.out.println("percentage of interest is 8.4%");
		}
		else if(age>=58&&age<100)
		{
			System.out.println("percentage of interest is 10.5%");	
		}
	}
}
}
