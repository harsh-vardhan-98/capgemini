package String_assignment;

public class StringBuffer1 {
	public static void main(String[] args) {
		
	StringBuffer sbf1 = new StringBuffer("String buffer ");
	sbf1.append("is a peer class of String");
	sbf1.append("that provides much of");
	sbf1.append("the functionality of strings");
	System.out.println("Input: " + sbf1);
	
	StringBuffer sbf2 = new StringBuffer("It is used to at the specified index position");
	sbf2.insert(13, " insert text");
	System.out.println("Input: " + sbf2 );
	
	StringBuffer sbf3 = new StringBuffer("This method returns the reversed object on which it was called");
	sbf3.reverse();
	System.out.println("Input: " + sbf3 );

	}
}
