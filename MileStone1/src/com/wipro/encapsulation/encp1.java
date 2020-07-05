package com.wipro.encapsulation;
class Author{
	String name;
	String email;
	char gender;
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
}
class Book{
	String name;
	Author aur;
	double price;
	int qtyInStock;
	Book(String name,Author aur,double price,int qtyInStock)
	{
		this.name=name;
		this.aur=aur;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAur() {
		return aur;
	}
	public void setAur(Author aur) {
		this.aur = aur;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
}
public class encp1 {
public static void main(String[] args) {
	Author au=new Author("bhargavi","bhar123@gmail.com",'F');
	Book b=new Book("History of Emporers",au,1500,560);
	System.out.println(b.getName());
	System.out.println(b.getAur().name);
	System.out.println(b.getAur().email);
	System.out.println(b.getAur().gender);
	System.out.println(b.getPrice());
	System.out.println(b.getQtyInStock());
}
}
