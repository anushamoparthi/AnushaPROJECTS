package java_prgs;

public class LargestNum {

	public static void main(String[] args) {
	
		int[] num={1,5,3,6,9};
		int large=num[0];
		for(int i=0;i<num.length;i++){
			if(num[i]>large){
				large=num[i];
			}
		}
		System.out.println("largest number: "+large);

	}

}
