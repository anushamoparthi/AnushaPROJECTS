package java_prgs;

import java.util.Arrays;

public class SeparateZerosFromNonzeros {

	public static void main(String[] args) {
		moveZerosToFront(new int[]{3,0,5,7,3,0,1,0});
		moveZerosToEnd(new int[] {3,0,1,6,0,7,0});
	}
	
	static void moveZerosToEnd(int[] arr){
		
		int counter=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				arr[counter]=arr[i];
				counter++;
			}
			}
		
			while
				(counter<arr.length){
				arr[counter]=0;
				counter++;
			}
		System.out.println(Arrays.toString(arr));
	}
	
static void moveZerosToFront(int[] arr){
		
		int counter=arr.length-1;
		System.out.println(arr.length );
		
		
		for(int i=arr.length-1;i>=0;i--){
			
			if(arr[i]!=0){
				arr[counter]=arr[i];
				counter--;
			}
		}
		while
			(counter>=0){
			arr[counter]=0;
			counter--;
		
		}
			
		
			
		System.out.println(Arrays.toString(arr));
	}

}
