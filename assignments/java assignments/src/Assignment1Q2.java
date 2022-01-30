
class ArmStrongOrNot {
	
	public boolean isArmStrong(int y) {
		int k = y;
		int r = 0;
		int n ;
		
		while(k!=0) {
			n = k%10;
			r += Math.pow(n, 3);
			k = k/10;
		};
		
		if(r == y) {
			return true;
		}else {
			return false;
		}
	}

}

public class Assignment1Q2 {
	public static void main(String[] args) {
		int startlimit = 100;
		int endlimit = 999;
		ArmStrongOrNot ob = new ArmStrongOrNot();
		
		for(int i = startlimit; i<= endlimit;i++) {
			if(ob.isArmStrong(i)){
				System.out.println(i);		
			}else{
				continue;
			}
		}
		
	}

}
