package java_prgs;

public class factorial {
	void fact(int n){
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println("factorial of "+n+ " is: "+fact);
	}
	public static void main(String[] args) {
		factorial f=new factorial();
		f.fact(3);
        f.fact(6);
        f.fact(9);
	}

}
