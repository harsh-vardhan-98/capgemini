package exceptionhandeling;

public class Main {
	public static void main(String[] args) {
		try {
			int data = 100/0;
			System.out.println("no exception arisis");
		} catch (Exception e) {
			System.out.println("exception handled");
//			e.printStackTrace();
		}
	}
}
