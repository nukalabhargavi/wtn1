package com.wipro.exceptionhandling;
import java.util.*;

import org.omg.Messaging.SyncScopeHelper;
class NegativeException extends Exception{
	NegativeException(String s)
	{
		super(s);
	}
}
public class exceptp3 {
	 static int numberexc(String name,int m1,int m2,int m3,String name2,int sm1,int sm2,int sm3)throws NegativeException,NumberFormatException
	 { int s=0;
		 if(m1<0 ||m1>100||m2<0||m2>100||m3<0||m3>100||sm1<0||sm1>100||sm2<0||sm2>100||sm3<0||sm3>100)
			 throw new NegativeException("Marks are out of range and are not between (0-100)");
		 else
		 {
			 s+=(m1+m2+m3+sm1+sm2+sm3);
		 }
		 return (s/2);
	 }
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	try {
	System.out.println("Enter details of first student");
	String name=sc.next();
	int m1,m2,m3;
	m1=sc.nextInt();
	m2=sc.nextInt();
	m3=sc.nextInt();
	System.out.println("Enter details of second student");
	String name2=sc.next();
	int sm1,sm2,sm3;
	sm1=sc.nextInt();
	sm2=sc.nextInt();
	sm3=sc.nextInt();
	
	System.out.println("The average of two students is" + numberexc(name,m1,m2,m3,name2,sm1,sm2,sm3));
	}catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println("Problem 3 is done!");
	
}
}
