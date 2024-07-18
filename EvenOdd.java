package com.wipro;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String args[]) {
		System.out.println("Check Whether number is Even or Odd ");
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println(num+" is a even Number");
		}
		else {
			System.out.println(num+" is a odd number");
		}
		main(args);		
		
	}

}
