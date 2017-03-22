package com.java.practice.sorting;

public class QuickSort {

	public static void main(String[] args) {
		int array1[]={3,6,6,9,0};
		for(int j:array1)
		{
			System.out.print(j);
			System.out.print(" ");
					
		}
		System.out.println();
		System.out.println(array1.length);
		quickSort(array1, 0, array1.length - 1);      
		for(int j:array1)
		{
			System.out.print(j);
			System.out.print(" ");
		
		}
	}
	
	static void  quickSort(int arr[], int left, int right) {
		int i = left, j = right;
		System.out.println("value of i:"+i + "  value of j:"+j);
		int tmp;
		int pivot = arr[(left + right) / 2];
		System.out.println("pivot:" +pivot);
	
		 while (i <= j) {
		while (arr[i] < pivot)
				i++;
		System.out.println("value of "+ i+":" +arr[i]);
		while (arr[j] > pivot)
				j--;
			System.out.println("value of "+ j+":" +arr[j]);
				if (i <= j) {
				tmp=arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
				System.out.println("1) value of "+ i+" :" +arr[i] + "  value of "+ j+":" +arr[j]);

			}
				//System.out.println("2) value of "+ i+" :" +arr[i] + "  value of "+ j+":" +arr[j]);

		 }
		 System.out.println("2) value of i:"+i+ " value of j:"+j);

		if (left < j)
		 quickSort(arr, left, j);
		 if (i < right)
		 quickSort(arr, i, right);
		}
	
	
	 
	/*	public static void quickSort(int arr[], int start, int end)
		{
		        int i = start;                          
		        int k = end;                    

		        if ((end - start)>= 1)       
		        {
		                int pivot = arr[start];       

		                while (k > i)                   
		                {
		                        while (arr[i] <= pivot && i <= end && k > i)  
		                                i++;                                    
		                        while (arr[k] > pivot && k >= start && k >= i) 
		                            k--;                                        
		                        if (k > i)                                      
		                                swap(arr, i, k);                      
		                }
		                swap(arr, start, k);         
		                                                 
		                quickSort(arr, start, k - 1); 
		                quickSort(arr, k + 1, end);   
		        }
		        else    
		        {
		                return;                    
		        }
		}

		public static void swap(int array[], int index1, int index2) 
		
		{
			int temp = array[index1];          
			array[index1] = array[index2];      
			array[index2] = temp;              
		}
*/
	}


