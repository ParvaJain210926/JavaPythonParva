package com.wipro;
import java.util.Scanner;
public class TempConvert {

	public static void main(String[] args) {
		System.out.println("Enter the temperature in celcius: ");
		Scanner sc=new Scanner(System.in);
		float temp=sc.nextFloat();
		float fahren=(temp*9)/5 + 32;
		System.out.println("Fahrenheit temperature is : "+ fahren);
		// TODO Auto-generated method stub

	}

}
