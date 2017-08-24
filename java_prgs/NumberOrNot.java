package java_prgs;

public class NumberOrNot {

	public static void main(String[] args) {
		numOrnot("653465");

	}
	
	public static void numOrnot(String input){
		try{
			Integer.parseInt(input);
			System.out.println("yes");
		}catch(Exception e){
			System.out.println("no");
		}
		
	} 

}
