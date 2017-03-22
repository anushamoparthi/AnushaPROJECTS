package com.java.practice.examples;

import java.util.Arrays;
import java.util.Scanner;

public class GreaterInArray {

	public static void main(String[] args) {

		int a[] = { 10, 3, 54, 12 };
		int max = a[0];
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] > max)
				max = a[i];
		}
		System.out.println("greatest " + max);

	}

}
