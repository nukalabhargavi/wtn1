package com.wipro.inheritance;
class Animal{
	void eat()
	{
		System.out.println("Animals eat");
	}
	void sleep()
	{
		System.out.println("Animals sleep");
	}
}
class Bird extends Animal{
	@Override
	void eat()
	{
		System.out.println("Birds eat");
	}
	@Override
	void sleep()
	{
		System.out.println("Birds sleep");
	}
	void fly()
	{
		System.out.println("All the Birds fly");
	}
}
public class inhep1 {
public static void main(String args[])
{
	Animal a=new Animal();
	Bird b=new Bird();
	a.eat();
	a.sleep();
	b.eat();
	b.sleep();
	b.fly();
	
}
}
