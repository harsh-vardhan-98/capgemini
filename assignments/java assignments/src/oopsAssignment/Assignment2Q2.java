package oopsAssignment;

import java.util.ArrayList;
import java.util.List;

class Manager extends Assignment2Q2{
	public int getSalary(int salary) {
		int incentive = 5000;
		return incentive+salary;
	}
}



class Labour extends Assignment2Q2{
	public int getSalary(int salary) {
		int incentive = 500;
		return incentive+salary;
	}
}







public class Assignment2Q2 {
	int salary = 10000;
	public int getSalary(int salary) {
		return salary;
	}
	
	public static int totalSalary(ArrayList<Integer>employeeSalaries) {
		int sum = 0;
		for (int i : employeeSalaries) {
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> employeeList = new ArrayList<>();
		
		Manager m1 = new Manager();
		Manager m2 = new Manager();
		employeeList.add(m1.getSalary(2000));
		employeeList.add(m2.getSalary(3000));
		
		Labour l1 = new Labour();
		Labour l2 = new Labour();
		employeeList.add(l1.getSalary(1000));
		employeeList.add(l2.getSalary(1500));
		
		System.out.println(totalSalary(employeeList));
	

	}
}
