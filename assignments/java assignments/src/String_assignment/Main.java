package String_assignment;
class StringClass{
	private String str = "Hello world";
	public int length() {
		return str.length();
	}
	
	public String concate(String str1) {
		return str + str1;
	}
	
	public void toLowerCase(String str1) {
		System.out.println(str1.toLowerCase());
	}
	
	public void toUpperCase(String str1) {
		System.out.println(str1.toUpperCase());
	}
	
	public void replace(String str1) {
		System.out.println(str1.replace("a", "$"));
	}
	
	public void checkContain(String str1) {
		System.out.println(str1.contains("collection"));
	}
	public void compare(String str1) {
		if(str1.equals(" java string pool refers to collection of strings which are stored in heap memory")) {
			System.out.println("True in equals");
		}else {
			if(str1.equalsIgnoreCase(" java string pool refers to collection of strings which are stored in heap memory")) {
				System.out.println("equals ignore case");
			}
		}
	}
	
}



public class Main {
 public static void main(String[] args) {
	 StringClass s1 = new StringClass();
	 String str1 = " Java String pool refers to collection of Strings which are stored in heap memory";
	 String str2 = " java string pool refers to collection of strings which are stored in heap memory";
	 System.out.println(s1.concate(str1));
	 s1.replace(str1);
	 s1.checkContain(str1);
	 s1.compare(str2);
		 
	 
 }
}
