package java_prgs;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no.of rows:");
		int rows=scan.nextInt();
		
		int rowcount=1;
		for(int i=rows;i>0;i--){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=1; k<=rowcount;k++){
				//for(int m=1;m<=10;m++)
				System.out.print(k+" ");
				
			
				}
			System.out.println();
			rowcount++;
		}
		
          
	}
}
