package oopsAssignment;

class Singleton_tut{
	private static Singleton_tut instance = null;
	public String s;
	
	
	private Singleton_tut() {
		s = "new singleton example";
	}
	
	public static Singleton_tut getInstance() {
		if (instance == null) {
			instance = new Singleton_tut();
		}
		return instance;
	}
}

public class Assignment2Q1 {
	public static void main(String[] args) {
		Singleton_tut ob = Singleton_tut.getInstance();
		Singleton_tut ob1 = Singleton_tut.getInstance();
		Singleton_tut ob2 = Singleton_tut.getInstance();
		
		ob.s = "first object instance";
		System.out.println(ob1.s);
	


		
		

	}
	

}
