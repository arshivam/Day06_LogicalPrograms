package com.bridgelabz.logicalprograms;
import java.util.*;

public class CouponNumbers {
	public static void main(String[] args) {
		System.out.println("Enter the number of coupons you want to genrate :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int coupon = 0;
		int distinctCoupons = coupon;
		System.out.println("number of distinct coupons genrated are ::");
		for (int i=0; i<n; i++) {
			coupon = (int) (Math.random()*100000+1);
			if (distinctCoupons!=coupon) {
				System.out.println(coupon);
			}
			if (distinctCoupons==coupon) {
				i--;
			}
		}
	}
}
