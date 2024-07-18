package com.wipro;

import java.util.Scanner;

public class DevilPerson {
	public static void main(String args[]) {
		DevilPerson d=new DevilPerson();
		Scanner sc =new Scanner(System.in);
		String str =sc.next();
		int count=0,sum=0;
        
        char[] charArray = str.toCharArray();
        
        // Print the array elements
        for (char c : charArray) {
  
			count++;
			
			if(c=='@' || c=='$') {
				sum=Math.max(sum,count);
				count=0;
			}
		
	}
        System.out.println("Total MAximum length is : "+sum);
        }
	}
