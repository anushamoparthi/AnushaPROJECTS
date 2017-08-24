package java_prgs;

public class employe{
private String emName;
private double emSalary;


public void setName(String name){
emName=name;
}
public String getName(){
	return emName;
}
public void setSalary(double salary){
	emSalary=salary;
}
public double getSalary(){
	return emSalary;
}
public void testing(){
	System.out.print("Name of the employee is"  );
	System.out.println(getName());
	System.out.print("Salary of the employee is" );
	System.out.println(getSalary());
	//System.out.printf("Name of the employe is %d\n" ,getName());
	//System.out.println();
	//System.out.printf("Salary of the employe is %d" ,getSalary());
}
}


