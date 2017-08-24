package java_prgs;

import java.util.Scanner;

public class reverse_string {

	public static void main(String[] args) {
		
		  String str= "this is a string"; 
		  String[] strarray=str.split("\\s");
		  String revstr="";
		  System.out.println("input string is:"+ str);
		  for(String str1:strarray){ revstr=str1+ " " +revstr;}
		  System.out.println("reverse string is: " +revstr); 
		 // reverseString();
		 

		//String s;
		Scanner scan = new Scanner(System.in);
		System.out.println("the given string is:");
		String s = scan.next();
		
		String rev="";
		for(int i=(s.length())-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
		System.out.println("the reverse string is:"+rev);

	}
}
