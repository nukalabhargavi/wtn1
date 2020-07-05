package com.wipro.exceptionhandling;
import java.util.*;
class InvalidCountryException extends Exception{
	InvalidCountryException(String s)
	{
		super(s);
	}
}
public class UserRegistration{
static void registerUser(String username,String userCountry) throws InvalidCountryException{
	if(userCountry.equals("India"))
	{
		System.out.println("User registration done sucessfully");
	}
	else
		throw new InvalidCountryException("User Outside India cannot be registered");	
		
}
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	try {
		
		//String name=sc.next();
		//String Country=sc.next();
		//registerUser("Rama","India");
		registerUser("Mickey","US");
	}
	catch(Exception e)
	{
		System.out.println("InvalidCountryException should be thrown: "+e);
	}
}
}
