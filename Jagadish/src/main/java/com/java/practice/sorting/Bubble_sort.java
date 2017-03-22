package com.java.practice.sorting;

//import java.util.Scanner;

public class Bubble_sort {

	public static void main(String[] args) {
	/*	Scanner in=new Scanner(System.in);
		int input[]=new int[5];
		System.out.print("enter numbers to be sorted:");
		for(int i=0;i<input.length;i++){
		
		input[i]=in.nextInt();
		}	
		*/
		int input[]={2,4,23,7,12,6,};
		boolean swap=false;
		do{ swap=false;
			for(int i=0;i<input.length-1;i++){
				if(input[i]<input[i+1]){
					int temp=input[i+1];
					input[i+1]=input[i];
					input[i]=temp;
					swap=true;
				}
			}
		}while(swap);
		
				for(int j=0;j<input.length;j++){
			System.out.print(input[j]+",");
			//System.out.println();
		}
	}
}
