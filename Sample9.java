package com.wipro;

import java.util.Scanner;




//creating your own exception class
class MyException extends Exception{
	MyException(String msg){
		super(msg);
		
	}
}

public class Sample9 {

	public static void main(String[] args) {
		int a=0,b=0;
		
		Scanner s = new Scanner(System.in);	
		
		System.out.println("Enter the first number: ");
		a=s.nextInt();
		System.out.println("Enter the second number: ");
		b=s.nextInt();
		
		
		try {
			
			System.out.println(a/b); 
			
			throw new MyException("Error Occured");
			
		}	
		catch(MyException E) {
			System.out.println("Error new myexception");
		}
		
		catch(ArithmeticException E) {		      
			System.out.println("Zero input changed to 1");
			b=1;
			System.out.println(a/b);
		}
		
		catch(Exception E){
		      
			System.out.println("Cannot Divide By Zero Sorry!!!");
			
		}
		//exception encounter hone ke bad bhi yeh execute hoga
		
		
		// system will surrender will not execute if no try catch is writtern in code that what exception handling means
		
		System.out.println("This will also get executed");
	}
}
