package com.wipro.inheritance;

public class TestEmployee {
public static void main(String[] args) {
	Employee e=new Employee();
	e.setName("bhargavi");
	e.setAnnualsalary(100000.00);
	e.setYear(2020);
	e.setNational_insurancenumber("RYN1234");
	System.out.println(e.getName()+"\n"+e.getAnnualsalary()+"\n"+e.getYear()+"\n"+e.getNational_insurancenumber());
}
}
