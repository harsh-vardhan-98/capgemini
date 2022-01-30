import java.util.Scanner;
class Sici{
	
	
	
	public double simpleInterest( double p, int t, double r) {
		double result;
		result = (p*t*r)/100;
		return result;
	}
	
	public double compoundInterest(double x, int t, double r) {
		
		
		double result = x*(Math.pow(1+r/100, t))-x;
		return result;
		
	}

	

	
	
}



public class Assignment1Q3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the principle");
		double p = input.nextDouble();
		
		System.out.println("Enter the time");
		int t = input.nextInt();
		
		System.out.println("Enter the rate of interest");
		double r = input.nextDouble();
		
		Sici ob = new Sici();
		System.out.println("Simple interest will be "+ob.simpleInterest(p, t, r));
		System.out.println("Compound interest will be "+ob.compoundInterest(p, t, r));
		
		
	}

}
