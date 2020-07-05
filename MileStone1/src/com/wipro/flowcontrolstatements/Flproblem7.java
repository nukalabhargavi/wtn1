package com.wipro.flowcontrolstatements;

public class Flproblem7 {
public static void main(String[] args) {
	if(Character.isUpperCase(args[0].charAt(0))){
		System.out.println(Character.toLowerCase(args[0].charAt(0)));
	}
	else
	{
		System.out.println(Character.toUpperCase(args[0].charAt(0)));
	}
}
}
