package java_prgs;

public class SumOf2NumsInArray {

	public static void main(String[] args) {

		int[] numbers = { 5, 6, 8, 7, 2, 4 };
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if((numbers[i]+numbers[j])==10){
					System.out.println("pair:"+numbers[i] + "&" +numbers[j]);
				}
				//System.out.println(numbers[i]);
			}
		}
	}

}
