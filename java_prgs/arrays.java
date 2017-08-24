package java_prgs;

public class arrays {

	public static void main(String[] args) {
		String[] str={"mango","apple","banana","grapes","cherry","orange"};
for(int i=0;i<str.length;i++){
	System.out.print(str[i]+"\t");
	System.out.println("------------------------------------------");
	System.out.println(str.length);
	
}
System.out.println();
	int[][] a={{1,2,3,4},{2,3,4},{1},{5,6}};
	table(a);
	System.out.println(a.length);
	
	}
public static void table(int[][] x){
	 
	for(int row=0;row<x.length;row++){
		for(int col=0;col<x[row].length;col++){
			System.out.print(x[row][col]+"\t");
		}
		System.out.println();
		
}
}


	}
	
	

	