package com.java.practice.examples;

public class Array_example {

	public static void main(String[] args) {
		
		int[] arr={2,1,5,3,1,2};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++){
				int sum=arr[i]+arr[j];
				if(sum==4){
				System.out.println(""+arr[i]+","+arr[j]);
				}
			}
		}

	}

}
