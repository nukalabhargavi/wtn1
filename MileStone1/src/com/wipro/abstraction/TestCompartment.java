package com.wipro.abstraction;
import java.util.*;
abstract class Compartment{
abstract String notice();	
}
class FirstClass extends Compartment{
	@Override
	String notice()
	{
		return "Firstclass compartment is more comfortable.";
	}
}
class Ladies extends Compartment{
	@Override
	String notice()
	{
		return "Ladies compartment is only for ladies.";
	}
}
class General extends Compartment{
	@Override
	String notice()
	{
		return "General compartment ticket costs less and is affordable.";
	}
}
class Luggage extends Compartment{
	@Override
	String notice()
	{
		return "Luggage compartment has all passengers luggage packed in for their safe journey.";
	}
}
public class TestCompartment {
	public static void main(String[] args) {
	Compartment com[]=new Compartment[10];
	Random rand = new Random();
	for(int i=0;i<10;i++)
	{
		int rand_int = rand.nextInt(5);
		if(rand_int==1)
		{
			com[i]=new FirstClass();
		}
		else if(rand_int==2)
		{
			com[i]=new Ladies();
		}
		else if(rand_int==3)
		{
			com[i]=new General();
		}
		else if(rand_int==4)
		{
			com[i]=new Luggage();
		}
		else
			i--;
	}
	for(int i=0;i<10;i++)
		System.out.println(com[i].notice());
	}
}
