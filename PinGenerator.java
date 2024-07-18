package com.wipro;

import java.util.Scanner;

public class PinGenerator{
	
	public int min_value(int num1,int num2,int num3) {
		if(num1<=num2 && num1<=num3) {
			return num1;
		}
		else if(num2<=num1 && num2<=num3) {
			return num2;
		}
		else {
			return num3;
		}		
	}
		
	public int max_value(int num1,int num2,int num3,int num4) {
		if(num1>=num2 && num1>=num3 && num1>=num4) {
			return num1;
		}
		else if(num2>=num1 && num2>=num3 && num2>=num4) {
			return num2;
		}
		else if(num3>=num1 && num3>=num2 && num3>=num4) {
			return num3;
		}
		else {
			return num4;
		}		
	}

	public static void main(String[] args) {
		PinGenerator pg=new PinGenerator();
		
		try {
			
			Scanner sc = new Scanner (System.in);
			int a=0,b=0,c=0;
			int pin=0;
			int max_num=0;
			System.out.println("Enter the three number:");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			int num3=sc.nextInt();
			for(int i=0; i<4;i++) {
				a= num1%10;
				b=num2 %10;
				c=num3%10;
				int min=pg.min_value(a, b, c);
				max_num=pg.max_value(a, b, c, max_num);
		
				if(i<3) {
					pin=(int) (min*Math.pow(10,i)+pin);
				}
				else {
					pin=(int)(max_num*Math.pow(10, i)+pin);
					}
				num1=num1/10;
				num2=num2/10;
				num3=num3/10;			
			}
			System.out.println("Pin generated is : "+ pin);
			//System.out.println(Math.max(10,Math.max(20,40)));
		
		}
		
		catch(Exception e) {
			System.out.println("Enter a number not a String");
			main(args);
		}
		
		}
	

}
