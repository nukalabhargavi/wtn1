package com.wipro.exceptionhandling;
class UserException extends Exception{
	UserException(String s)
	{
		super(s);
	}
}
public class exceptp5 {
	static void except(String name,int age)throws UserException{
		if(age<18 || age>=60)
			throw new UserException("Invalid age for the program");
		else
			System.out.println("You have succeffuly entered the program.");
	}
public static void main(String args[])
{try {
	String name=args[0];
	int age=Integer.parseInt(args[1]);
	except(name, age);
	
}catch(Exception e)
{
	System.out.println("UserException has raised "+e);
}
}
}
