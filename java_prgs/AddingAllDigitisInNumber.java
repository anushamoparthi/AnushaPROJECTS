package java_prgs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AddingAllDigitisInNumber {

	static void addDigits(int inputnum){
		int num=inputnum;
		int sum=0;
		
		while(num>0){
			int lastnum=num%10;
			sum = sum+lastnum;
			num=num/10;
		}
		
		System.out.println(sum);
	}
	public static void main(String[] args) {
		addDigits(345);
		addDigits(786654);
		
		
		
		
		
	}

}
