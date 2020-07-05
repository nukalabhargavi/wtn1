package com.wipro.arrays;
import java.util.Arrays;
public class Aproblem5 {
public static void main(String[] args) {
	int a[]=new int[] {1,12,43,2,8};
	Arrays.sort(a);
	System.out.println("The largest element is "+a[a.length-1]+" and the second largest element is "+a[a.length-2]);
	System.out.println("The smallest element is "+a[0]+" and the second smallest element is "+a[1]);
	
	
}
}
