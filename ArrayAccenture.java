package com.wipro;

public class ArrayAccenture {

	public static void main(String[] args) {
		
		int[] arr= {10,23,45,64,23,12,23};
		int temp=0;
		if (arr.length%2==0) {
			for(int i=0;i<arr.length;i++) {
				if(i%2!=0) {
					temp=temp+arr[i];
				}
			}
		}
		else {
			for(int i=0;i<arr.length;i++) {
				if(i%2==0) {
					temp=temp+arr[i];
				}
			}
		}
		System.out.print(temp);
		

	}

}
