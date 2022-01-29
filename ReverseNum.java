package com.bridgelabz.logicalprograms;
import java.util.*;

public class ReverseNum {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE NUMBER TO BE REVERSED = ");
		int number=sc.nextInt();
		int reverse=0;

		while(number!=0) {
			int Remainder = number % 10;
			reverse = reverse *10 + Remainder;
			number = number/10;
		}
		System.out.println("REVERSED NUMBER IS = " +reverse);
	}
}
