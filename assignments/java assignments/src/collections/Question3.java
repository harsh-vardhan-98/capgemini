package collections;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class Details{
	public int id;
	public String name;
		public String department;
		public long salary;
	public Details(int id, String name, String department, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public long getSalary() {
		return salary;
	}
	
}

class sortbyid implements Comparator<Details>{
	 
    @Override
    public int compare(Details e1, Details e2) {
    	return e1.getId()-e2.getId();
    }
}

class sortbysalary implements Comparator<Details>{
	 
    @Override
    public int compare(Details e1, Details e2) {
    	return (int) (e1.getSalary()-e2.getSalary());
    }
}

class sortbyname implements Comparator<Details>{

	@Override
	public int compare(Details o1, Details o2) {
		return o1.getName().compareTo(o2.getName());
	}
		
}

class sortbydepart implements Comparator<Details>{

	@Override
	public int compare(Details o1, Details o2) {
		return o1.getDepartment().compareTo(o2.getDepartment());
	}
		
}



public class Question3 {
	public static void main(String[] args) {
		
		Details d1 = new Details(1,"harsh","Aeronautical",300000);
		Details d2 = new Details(2,"abhsishek","It",100000);
		Details d3 = new Details(3,"jai","garden",30000);
		Details d4 = new Details(4,"chaman","plumber",17000);
		Details d5 = new Details(5,"zoravar","cargo",300000);
		
		
		while(true) {
		System.out.println("Enter by which you want to sort \n"+"1. id\n"+"2.name\n"+"3.department\n"+"4.salary");
		Scanner s =new Scanner(System.in);
		int k = s.nextInt();
		
		switch(k) {
		case 1:
			TreeSet<Details> t = new TreeSet<>(new sortbyid());
			t.add(d1);	
			t.add(d2);	
			t.add(d3);	
			t.add(d4);	
			t.add(d5);	
			for(Details d:t) {
				System.out.println(d.getId()+" "+d.getName()+" "+d.getDepartment()+" "+d.getSalary());
			}
			break;
		
		case 2:
			TreeSet<Details> t1 = new TreeSet<>(new sortbyname());
			t1.add(d1);	
			t1.add(d2);	
			t1.add(d3);	
			t1.add(d4);	
			t1.add(d5);	
			for(Details d:t1) {
				System.out.println(d.getId()+" "+d.getName()+" "+d.getDepartment()+" "+d.getSalary());
			}
			break;
			
		case 3:
			TreeSet<Details> t2 = new TreeSet<>(new sortbydepart());
			t2.add(d1);	
			t2.add(d2);	
			t2.add(d3);	
			t2.add(d4);	
			t2.add(d5);	
			for(Details d:t2) {
				System.out.println(d.getId()+" "+d.getName()+" "+d.getDepartment()+" "+d.getSalary());
			}
			break;
			
		case 4:
			TreeSet<Details> t3 = new TreeSet<>(new sortbysalary());
			t3.add(d1);	
			t3.add(d2);	
			t3.add(d3);	
			t3.add(d4);	
			t3.add(d5);	
			for(Details d:t3) {
				System.out.println(d.getId()+" "+d.getName()+" "+d.getDepartment()+" "+d.getSalary());
			}
			break;
	}
	}
		
	

}
}
