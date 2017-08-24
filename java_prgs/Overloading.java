package java_prgs;

public class Overloading {

	public static void main(String[] args) {
		Overloading obj=new Overloading();
		obj.add(1, 2);
		obj.add(2, 3,4);

	}
public void add(int x,int y){
	System.out.println(x+y);
}
public void add(int x,int y,int z){
	System.out.println(x+y+z);
}
}
