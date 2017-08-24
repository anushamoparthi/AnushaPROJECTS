package java_prgs;
import java.util.Scanner;
public class add_twoNums {

	public static void main(String[] args) {
		add(1,2);
		
		Scanner add = new Scanner(System.in);
		int x,y,sum;
		System.out.println("Enter first num:");
		x=add.nextInt();
		System.out.println("Enter sec num:");
		y=add.nextInt();
		sum=x+y;
		System.out.println("sum of two nums is "+sum);
	    add.close();

	}
public static void add(int a,int b){
	int sum1=a+b;
	System.out.println("sum is: "+sum1);
}

}
