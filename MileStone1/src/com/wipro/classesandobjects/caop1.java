package com.wipro.classesandobjects;

class Box{
	private double width;
	private double height;
	private double depth;
	Box(double width,double height,double depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
double volumePrint()
{
	return width*height*depth;
}
}
public class caop1 {
	public static void main(String args[]) {
Box b=new Box(2.3,3.4,5.6);
double k=b.volumePrint();
System.out.println(k);
	}
}
