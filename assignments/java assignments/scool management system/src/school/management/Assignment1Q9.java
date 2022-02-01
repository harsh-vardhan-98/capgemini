package school.management;

import java.util.Scanner;

class Student{
	private int subA;
	private int subB;
	private int subC;
	
	public Student(int a,int b,int c) {
		this.subA = a;
		this.subB = b;
		this.subC = c;
	}
	
	public int totalMarksInAllSubject(Student[] students) {
		int sum = 0;
		int result = 0;
		for (int i =0 ; i<3;i++) {
			sum= students[i].subA+students[i].subB+students[i].subC;
			result+=sum;
		}
		return result;
		
	}
	
	
}





public class Assignment1Q9 {
	public static void main(String[] args) {
		Student ob[] = new Student[3];
		int a=0,b=0,c=0;
		Scanner input = new Scanner(System.in);
		for (int i =0; i<3;i++) {
			a = input.nextInt();
			b= input.nextInt();
			c= input.nextInt();
			ob[i] = new Student(a,b,c);
		}
		
		System.out.println(ob[1].totalMarksInAllSubject(ob ));
	}

}
