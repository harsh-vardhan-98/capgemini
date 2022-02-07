package generics;

import java.util.HashSet;
import java.util.Set;

class Employee {
	private int id;
	private String name;
	private double salary;
	private String department;
	

	public Employee(int id, String name, double salary, String department) {
	
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	public void display() {
		System.out.print("Employee's details");
		System.out.println("id: "+id+" Name: "+name+" Department: "+department+" Salary: "+salary);
		
	}
}



public class GenericsQ1 {
	
	public static void main(String[] args) {
		
	
	Employee e1 = new Employee(1,"Harsh",24750.83,"Testing");
	Employee e2 = new Employee(2,"Ravi",29780.50,"Developer");

	Set<Employee> employee = new HashSet<>();
	employee.add(e1);
	employee.add(e2);
	
	for(Employee e: employee) {
		e.display();
	}
	
	
	
}
}
