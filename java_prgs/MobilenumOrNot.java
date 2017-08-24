package java_prgs;

import java.util.Scanner;

public class MobilenumOrNot {

	public static void main(String[] args) {
		System.out.println("enter mobile num:");
		Scanner scan = new Scanner(System.in);
		String number = scan.next();
		//if(num.length()==10){
		if (MobilenumOrNot.numornot(number) && (number.length() == 10)) {
			System.out.println("valid mobile number");
		} else {
			System.out.println("invalid mobile number");
		}

	}

	static boolean numornot(String num) {
		try {
			Integer.parseInt(num);
			System.out.println("yes! it is a number");

		} catch (Exception e) {
			System.out.println("No!Not a number");
			return false;
		}
		return true;
	}

}
