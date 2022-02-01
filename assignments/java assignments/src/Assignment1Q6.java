import java.util.Scanner;

class Login{
	private String userName = "Ajay";
	private String passWord = "password";
	
	public String loginUser(String user, String pass) {
		if((user.equals(userName)) && (pass.equals(passWord))) {
			return "Welcome";
		}else {
			return "Wrong Credential";
		}
	}
}
public class Assignment1Q6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String user = input.nextLine();
		String password = input.nextLine();
		Login l = new Login();
		int k = 0;
		
		while (k<3) {
			k++;
			if(l.loginUser(user, password) == "Welcome") {
				System.out.println("Welcome "+ user);
				break;
			}else {
				System.out.println("in else loop");
				l.loginUser(user, password);
			}
		}

	}
	
}
