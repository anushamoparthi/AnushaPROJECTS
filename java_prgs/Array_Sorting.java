package java_prgs;

import java.util.Arrays;

public class Array_Sorting {

	public static void main(String[] args) {
	String[] str= {"mango","orange","banana","apple"};
	Arrays.sort(str);
	System.out.println("Sorted string array:" );
for(int i=0;i<str.length;i++){

	System.out.println(str[i]);
}

int[] a = {12,34,13,78,24};
Arrays.sort(a);
System.out.println("sorted integer array:");
for(int j=0;j<a.length;j++){
	
	System.out.println(a[j]);
}
	}

}
