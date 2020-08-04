package com.revature.tier1;

import java.util.ArrayList;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {

		int power = 0;
		ArrayList<Integer> digits = new ArrayList<>();
		String parsedLong = Long.toString(num);

		for (int x = 0; x < parsedLong.length(); x++) {
			digits.add(Integer.parseInt(parsedLong.substring(x, x+1)));
		}
		int total = 0;
		power = parsedLong.length();

		for (Integer i : digits) {

			total += i ^ power;
		}

		if (total == num) {
			return true;
		} else
			return false;
	}
}
