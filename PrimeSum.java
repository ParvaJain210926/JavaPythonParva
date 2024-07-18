package com.wipro;

import java.util.Scanner;

public class PrimeSum {
	
	boolean check_Prime(int num) {
		int n=num/2;
		for (int i=2;i<n;i++) {
			if(num%i==0) {
				return false;
			}
		
		}
		return true ;
		}
	

	public static void main(String[] args) {
		
		int start,end,sum=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter start range:");
		start=sc.nextInt();
		System.out.println("Enter end range:");
		end=sc.nextInt();
		PrimeSum ps=new PrimeSum();
		for (int i=start;i<=end;i++) {
			if(ps.check_Prime(i)) {
				sum=sum+i;
			}
			
		// TODO Auto-generated method stub

	}
		System.out.println("Total of prime is: "+ sum);
		}

}
