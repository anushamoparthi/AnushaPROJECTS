package java_prgs;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
	//1) Using array	
		String[] strarray={"abc","sdf","dfg","esdgh","abc","sdg","dfg"};
		
		for(int i=0;i<strarray.length-1;i++){
			for(int j=i+1;j<strarray.length;j++){
				if((strarray[i].equalsIgnoreCase(strarray[j])) && (i!=j)){
					System.out.println("duplicate element:"+strarray[j]);
				}
			}
		}
		System.out.println("**********************************");
		
		//2) using hashset
		
		HashSet<String> set = new HashSet<String>();
		for(String arrElement:strarray){
			if(!set.add(arrElement)){
				System.out.println("duplicate element:"+arrElement);
			}
		}
	}

}
