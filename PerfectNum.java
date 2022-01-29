package com.bridgelabz.logicalprograms;
import java.util.*;

public class PerfectNum {
	public static void main(String[] args) {
		System.out.println("Enter the Number :");
		Scanner sc =new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		for (int i=1; i<number; i++) {
			if (number%i==0) {
				sum = sum + i;
			}
		}
		if (sum==number) {
			System.out.println(number+" is Perfect Number");
		}
		else {
			System.out.println(number+" is not Perfect Number");
		}
	}
}

