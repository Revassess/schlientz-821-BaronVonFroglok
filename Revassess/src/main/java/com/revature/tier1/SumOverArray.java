package com.revature.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
		int sum = 0;
		if (arr == null) {
			return 0;
		} else {
			for(int i : arr) {
				sum += i;
			}
			return sum;
		}
			

	}
}
