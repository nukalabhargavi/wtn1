package com.wipro.flowcontrolstatements;

public class Flproblem5 {
public static void main(String[] args) {
	if((args[0].charAt(0)>=65 && args[0].charAt(0)<=90)||(args[0].charAt(0)>=97 && args[0].charAt(0)<=122))
	{
		System.out.println("Alphabet");
	}
	else if((args[0].charAt(0)>=48 && args[0].charAt(0)<=57))
	{
		System.out.println("digit");
	}
	else
	{
		System.out.println("Special character");
	}
}
}
