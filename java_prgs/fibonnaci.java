package java_prgs;
//import java.util.Random;

public class fibonnaci {

	public static void main(String[] args) {
		int n1=0,n2=1,n3=0;
		System.out.println(n1+ " "+n2);
		//Random n=new Random();
		//System.out.println("Random numbers are: "+n);
		//num=n.nextInt(5);
		for(int i=2;i<=5;i++){
		
			n3=n1+n2;
			n1=n2;
			n2=n3;
		System.out.print(n3);
	}
	}
}
