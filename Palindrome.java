package com.wipro;

import java.util.Scanner;

public class Palindrome {
	public static void main(String aargs[]) {
	Scanner sc =new Scanner (System.in);
	int num=sc.nextInt();
	int t=num;
	int sum=0;
	while(num!=0) {
		int temp=num%10;
		sum=sum*10+temp;
		num=num/10;
	}
	if(sum==t) {
		System.out.println("Palindrome");;
	}
	else {
		System.out.println("Not Palindrome");
	}
	

}
	}
