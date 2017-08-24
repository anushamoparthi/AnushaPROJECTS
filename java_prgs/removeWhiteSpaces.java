package java_prgs;

public class removeWhiteSpaces {

	public static void main(String[] args) {
	
		//1) using replacesAll() method
		
		String str="introduction to      selenium";
		
		String newStr=str.replaceAll("\\s", "");
		System.out.println("the new string is: "+newStr);

		System.out.println("******************************************");
		//2) without using replaceAll() method
		
		char[] strarr=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<strarr.length;i++){
			if((strarr[i]!=' ')&& (strarr[i]!='\t')){
				sb.append(strarr[i]);
			}
		}
		System.out.println(sb);
	}

}
