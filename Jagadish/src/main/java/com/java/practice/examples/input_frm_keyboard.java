package com.java.practice.examples;

import java.util.Scanner;

public class input_frm_keyboard {

	public static void main(String[] args) {
		
		/*Scanner scan=new Scanner(System.in);
		System.out.println("input number : ");
		int num1=scan.nextInt();
		for(int i=0;i<10;i++){
		System.out.println(num1+"*"+(i+1)+"="+num1*(i+1));
		}
		
		System.out.println("java version : "+System.getProperty("java.version"));
	*/
		String str="this is a string";
		String rev="";
		String[] strarr=str.split("\\s");
		for(String s:strarr){
			rev=s + " " +rev;
		}System.out.println(rev);
		
		
		
	}

}
