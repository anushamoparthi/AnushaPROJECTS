package com.java.practice.examples;

public class repeatedElementsInArray {

	public static void main(String[] args) {
		int[] numbers = {1, 5, 23, 2, 1, 5, 5};
		// Arrays.sort(numbers);
		int count = 0;
		boolean check = false;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
					check=true;
					//System.out.println("duplicate");
					System.out.println("Duplicate: " + numbers[i]);
				}
			}
			if(check){
				count++;}
			System.out.println(count);
		}
		

	}

}
