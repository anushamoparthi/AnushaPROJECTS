package com.java.practice.sorting;

import java.util.Arrays;

public class QuickSortDemo {
	public static  int[] input;
	public static int length;
	public static void main(String[] args) {
		int[] unsorted={4,2,8,1,0,9};
		sort(unsorted);
		for(int i:unsorted){
		System.out.println("sorted array" +Arrays.toString(unsorted));
		}

	}
	static void sort(int[] numbers){
		if(numbers==null || numbers.length==0){
			return;
		}
		input=numbers;
		length=numbers.length;
		quicksort(0,length-1);
		
	}
	static void quicksort(int low,int high){
		int i=low;
		int j=high;
		int pivot=input[low+(low-high)/2];
		while(i<=j){
			while(input[i]<pivot){i++;}
			while(input[j]>pivot){j--;}
			if(i<=j){
				int temp=input[i];
				input[i]=input[j];
				input[j]=temp;
				i++;j--;
			}
		}
		if(low<j){
			quicksort(low,j);
		}
		if(i<high){
			quicksort(i,high);
		}
	}
	
	
}
