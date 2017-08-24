package java_prgs;

import java.util.Arrays;
import java.util.HashSet;

public class CommonElementsIn2Arrays {

	public static void main(String[] args) {
		
		//1) method 1
		
		String[] s1={"1","2","3","4","2"};
		String[] s2= {"3","6","7","2"};
		
		HashSet<String> set = new HashSet<String>();
		for(int i=0;i<s1.length;i++){
			for(int j=0;j<s2.length;j++){
				if(s1[i].equals(s2[j])){
					set.add(s1[i]);
				}
			}
		}
		System.out.println("common elements: "+set);
		
	System.out.println("*******************************************");
	
	//2) method2
	
	HashSet<String> set1 = new HashSet<>(Arrays.asList(s1));
	HashSet<String> set2 = new HashSet<>(Arrays.asList(s2));
	
	set1.retainAll(set2);
	
	System.out.println(set1);
	
	}

}
