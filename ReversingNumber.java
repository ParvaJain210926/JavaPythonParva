package com.wipro;

import java.util.Scanner;

public class ReversingNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int num=sc.nextInt();
		int sum=0;
		while(num!=0) {
			int temp=num%10;
			sum=sum*10+temp;
			num=num/10;
		}
		System.out.print("The number is : "+sum);
		// TODO Auto-generated method stub

	}

}
