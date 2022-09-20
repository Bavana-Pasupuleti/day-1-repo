import java.util.*;
class Employee{
	public static void main(String[] args) {
		System.out.println("Please enter Employee Details:");
		EmployeeDetails obj=new EmployeeDetails();
		obj.getDetails();
		obj.display();

		System.out.println();
		System.out.println();
		System.out.println();
	}
}
class EmployeeDetails{
	Scanner sc;
	int empno,age;
	String name,country;
	public void getDetails(){
		
		System.out.println("Start with your employee ID;");
		sc=new Scanner(System.in);
		empno=sc.nextInt();
		System.out.println("Name :");
		name=sc.next();
		System.out.println("Age :");
		age=sc.nextInt();
		System.out.println("Country :");
		country=sc.next();

	}
	public void display(){
		System.out.println(empno+";"+name+";"+age+";"+"country");
	}
}