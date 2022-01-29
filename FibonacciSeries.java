package com.bridgelabz.logicalprograms;
import java.util.*;

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("Enter the Nth number upto which you want fibonacci series :");
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int firstnum=0;
		int secondnum=1;
		while(i<=n) {
			System.out.println(firstnum + " ");
			int nextnum = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = nextnum;
			i++;
		}
	}
}
