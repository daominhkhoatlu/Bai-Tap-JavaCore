package edu.fa;

import java.util.Scanner;

public class Bai20 {
	Scanner sc = new Scanner(System.in);
	public void NhapMang(int a[],int n) {
		for(int i= 0; i < n;i++) {
			System.out.print("\na["+i+"]=");
			a[i] = sc.nextInt();
		}
	}

	public void XuatMang(int a[],int n) {
		for(int i = 0; i < n;i++) {
			System.out.print("\na[" + i+"]=" +a[i]);
		}
		
		
	}
	public static void main(String[] args) {
		Bai20 bai20 = new Bai20();
		Scanner sc1 = new Scanner(System.in);
		int a[] = new int[10];
		int n;
		System.out.print("\nEnter n:");
		n = sc1.nextInt();
		bai20.NhapMang(a, n);
		bai20.XuatMang(a, n);
		
		
	}

}
