package com.wipro;

import java.util.Scanner;

public class MatrixNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		
		for (int i=1;i<num;i++) {
			for(int j=1;j<num;j++) {
				if((i*j)<10) {
					System.out.print("0"+(i*j)+" ");
				}
				else {
				System.out.print(i*j+" ");
			}
			}
			System.out.println();
		}
	}
}
