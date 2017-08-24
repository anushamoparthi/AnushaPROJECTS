package java_prgs;

public class Equals_operator {
private static Equals_operator obj=new Equals_operator();
	private Equals_operator(){
		//System.out.println("constructor");
	}
	
	public static Equals_operator getmethod(){
		return obj;
	}
	public static void main(String[] args) {
		Equals_operator e1=Equals_operator.getmethod();
		Equals_operator e2=Equals_operator.getmethod();
		//System.out.println(e1==e2);
		
		
		String s1=new String("abc");
		String s2=new String("cde"
				+ "");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		
		String str1="abc";
		String str2="abc";
		str1="cde";
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		
		System.out.println(s1.equals(str2));
		System.out.println(s1==str2);
		System.out.println("***********************************");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
	}

}
