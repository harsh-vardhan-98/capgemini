import java.util.Scanner;
class TaxAmount {
	public double calculateTaxAmount(int ctc) {
		
		if (ctc<=180000) {
			return 0;
		}else if(ctc>180000 && ctc<= 300000){
			return 0.1*ctc;
		}else if(ctc>300000 && ctc<= 500000) {
			return 0.2*ctc;
		}else if(ctc>500000 && ctc<= 1000000) {
			return  0.3*ctc;
		}else {
			return 0;
			
		}
		
	}
}

public class Assignment1Q5 {
	public static void main(String[] args) {
		System.out.println("Enter your Income");
		
		Scanner input = new Scanner(System.in);
		int ctc = input.nextInt();
		
		TaxAmount tx =  new TaxAmount();
		System.out.println("Taxable amount "+tx.calculateTaxAmount(ctc));
	}
}


















