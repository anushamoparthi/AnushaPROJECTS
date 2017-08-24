package java_prgs;
import java.util.Scanner;

public class EmTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		employe e = new employe();
		System.out.println("enter name:");
		String temp1= input.nextLine();
		e.setName(temp1);
		System.out.println("Enter salary:");
		double temp2=input.nextDouble();
		e.setSalary(temp2);
		input.close();
		e.testing();

	}

}
