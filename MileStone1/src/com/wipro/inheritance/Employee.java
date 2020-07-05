package com.wipro.inheritance;

public class Employee extends Person{
double annualsalary;
int year;
String national_insurancenumber;
String name;
public void setName(String name) {
	super.name = name;
}
public double getAnnualsalary() {
	return annualsalary;
}
public void setAnnualsalary(double annualsalary) {
	this.annualsalary = annualsalary;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getNational_insurancenumber() {
	return national_insurancenumber;
}
public void setNational_insurancenumber(String national_insurancenumber) {
	this.national_insurancenumber = national_insurancenumber;
}

}
