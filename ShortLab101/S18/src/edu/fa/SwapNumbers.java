package edu.fa;

import java.util.Scanner;

public class SwapNumbers {

	public void swap(int a,int b) {
		int temp = a;
		a = b;
		b= temp;
		System.out.println("In swap: num1 = "+a+",num2 = "+b);
	}
	public static void main(String[] args) {
		int num1,num2;
		SwapNumbers swapNumbers = new SwapNumbers();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter number 1:");
		num1 =Integer.parseInt(sc.nextLine());
		
		System.out.print("\nEnter number 2:");
		num2 =Integer.parseInt(sc.nextLine());
		
		System.out.println("Before swap: num1 = "+num1+",num2 = "+num2);
		
		swapNumbers.swap(num1, num2);
		
		
		System.out.println("After swap:num1 ="+num1+",num2 = "+num2);
		
		
	}

}
