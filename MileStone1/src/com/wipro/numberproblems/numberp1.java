package com.wipro.numberproblems;
import java.util.*;
public class numberp1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		for(int i=1;i<=n;i++)
			s+=i;
		System.out.println("sum of first n natural numbers is "+s);
	}
}
