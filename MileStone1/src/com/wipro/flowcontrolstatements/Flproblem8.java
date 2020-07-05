package com.wipro.flowcontrolstatements;

public class Flproblem8 {
public static void main(String[] args) {
	switch(args[0].charAt(0)){
	case 'R':
	{
		System.out.println(args[0]+":Red");
		break;
	}
	case 'B':
	{
		System.out.println(args[0]+":Blue");
		break;
	}
	case 'G':
	{
		System.out.println(args[0]+":Green");
		break;
	}
	case 'O':
	{
		System.out.println(args[0]+":Orange");
		break;
	}
	case 'Y':
	{
		System.out.println(args[0]+":Yellow");
		break;
	}
	case 'W':
	{
		System.out.println(args[0]+":White");
		break;
	}
	default:
	{
		System.out.println("Invalid Code");
		break;
	}
	
		
	}
}
}
