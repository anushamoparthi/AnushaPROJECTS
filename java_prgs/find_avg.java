package java_prgs;
import java.util.Scanner;

public class find_avg {

	public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("Enter your score in 6 subjects");
         int total=0;
         int marks;
         int avg;
         
         int i=0;
         for(i=0;i<6;i++){
        	 marks = input.nextInt();
        	 total+=marks;
        	// i++;
    		}input.close();
         System.out.println("Your total:"   +total);
         avg=total/6;
         System.out.println("your avg:"  +avg);
	if(avg>=90){
	System.out.println("grade is A+");
	}else if(avg>=75){
		System.out.println("grade is A");
	}else if(avg>=65)
		{System.out.println("grade is B+");
		}else if(avg>=55)
		{System.out.println("grade is B");
		}else
		System.out.println("grade is C");

	
	}

}
