package java_prgs;

import java.util.Random;

public class sum_of_random_no {

	public static void main(String[] args) {
		Random num = new Random();
		int sum = 0;
		for (int i = 0; i <= 5; i++) {
			int numbers = num.nextInt(10);
			sum += numbers;
			System.out.println(numbers);
		}
		System.out.println(sum);

	}

}
