package lambda;
interface Math1{
	public int calculate(int t,int u);
}
public class Question1 {
	public int operate(int a, int b , Math1 m) {
		return m.calculate(a, b);
	}
	
	public void addition(int a, int b) {
		Math1 m1 = (t,v)->(t+v);
		System.out.println("addition :"+ operate(a,b,m1));
	}
	
	public void subtraction(int a , int b) {
		Math1 m1 = (t,v)->(t-v);
		System.out.println("subtraction :"+ operate(a,b,m1));
	}
	
	public void multiply(int a , int b) {
		Math1 m1 = (t,v)->(t*v);
		System.out.println("multiplication :"+ operate(a,b,m1));
	}
	
	public void division(int a , int b) {
		Math1 m1 = (t,v)->(t/v);
		System.out.println("division :"+ operate(a,b,m1));
	}
	
	
	
	public static void main(String[] args) {
		int a=13,b=5;
		Question1 q1 = new Question1();
		q1.addition(a, b);
		q1.subtraction(a, b);
		q1.multiply(a, b);
		q1.division(a, b);

}
}
