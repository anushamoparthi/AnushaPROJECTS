package java_prgs;

public class palindrome {
public static void main(String[] args)
{ 
	int input=12;
	int r,temp=input,n=0;
	while(input>0){
		r=input%10;
		n=(n*10)+r;
		input=input/10;
	}
	if(temp==n){
	System.out.println("palindrome");
}
	else {
	System.out.println("not palindrome");
}
	}
}
