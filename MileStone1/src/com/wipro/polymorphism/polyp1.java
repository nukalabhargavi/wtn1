package com.wipro.polymorphism;
class Fruit{
	String name;
	String taste;
	int size;
	Fruit(String name,String taste,int size)
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	void eat()
	{
		System.out.println("fruits have diffrent tastes and sizes");
	}
}
class Apple extends Fruit{
	Apple(String name,String taste,int size)
	{
		super(name,taste,size);
	}
	@Override
	void eat()
	{
		System.out.println(this.name+" has a "+this.taste+" taste and has a size of "+this.size+" gms");
	}
	
}
class Orange extends Fruit{
	Orange(String name,String taste,int size)
	{
		super(name,taste,size);
	}
	@Override
	void eat()
	{
		System.out.println(this.name+" has a "+this.taste+" taste and has a size of "+this.size+" gms");
	}
	
}
public class polyp1 {
public static void main(String[] args) {
	Apple a=new Apple("Apple","Sweet",250);
	Orange o=new Orange("Orange","Sour",500);
	a.eat();
	o.eat();
}
}
