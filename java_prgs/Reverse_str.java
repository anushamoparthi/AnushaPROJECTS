package java_prgs;

import java.util.Scanner;

public class Reverse_str {
	public static void reverseString() {
		String rev = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string:");
		String input = in.nextLine();
		System.out.println(input.length());
		for (int i = (input.length()) - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}
		if (input.equals(rev)) {
			System.out.println("The given string is palindrome: " + rev);

		} else {
			System.out.println("The given string is not palindrome: " + rev);
		}
		in.close();
	}

	public static void main(String[] args) {
		reverseString();
		String str = "hello";
		System.out.println("the input string is: " + str);
		String revstr = "";
		for (int i = (str.length() - 1); i >= 0; i--)
			revstr = revstr + str.charAt(i);
		System.out.println("reverse string is: " + revstr);

	}

}
