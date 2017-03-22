package com.java.practice.sorting;

public class Mergesort {
	public static  int[] arr={4,1,9,5,0};
	//static int[] newArray;
	
	public static void main(String[] args) {
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		MergeSort(0,arr.length-1);
		for(int i=0;i<arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}
	}
	static void MergeSort(int left,int right){
	
		if(left<right){
		int mid=(left+right)/2;
		MergeSort(left,mid);
		MergeSort(mid+1,right);
		Merge(left,mid,right);
		}
	}
	
	static void Merge(int left,int mid,int right){
		int[] newArray=new int[arr.length];
		
		int i=left;
		int j=mid+1;
		int k=0;
		int x;
		
		while((i<=mid) && (j<=right)){
			if(arr[i]<=arr[j])
			{
				newArray[k]=arr[i];
				i++;
			}else{
				newArray[k]=arr[j];
				j++;
			}
			k++;
		}
		
		if(i>mid)
		 {
		  for(x=j;x<=right;x++)
		  {
		   newArray[k]=arr[x];
		   k++;
		  }
		 }
		 else
		 {
		  for(x=i;x<=mid;x++)
		  {
		   newArray[k]=arr[x];
		   k++;
		  }
		 }
		 
		 for(x=left;x<=right;x++) 
			 arr[x]=newArray[x];
		}

		
	}


