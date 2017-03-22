package com.java.practice.sorting;

public class Selectionsort {

	public static void main(String args[]){
		
		int[] A={3,8,1,7,4,0};
		int min;
		
		for(int i=0;i<A.length;i++){
			min=i;
			for(int j=i+1;j<A.length;j++){
				if(A[j]<A[min]){min=j;}
			}
			int temp=A[i];
			A[i]=A[min];
			A[min]=temp;
			System.out.print(A[i]);
			System.out.print(" ");
		}
		
	}
	
	
}
