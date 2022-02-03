package String_assignment;

public class String_Builder {
	public static void main(String[] args){
		
	StringBuilder sbf1 = new StringBuilder("String buffer ");
	sbf1.append("is a peer class of String");
	sbf1.append("that provides much of");
	sbf1.append("the functionality of strings");
	System.out.println("Input: " + sbf1);
	
	StringBuilder sbf2 = new StringBuilder("It is used to at the specified index position");
	sbf2.insert(13, " insert text");
	System.out.println("Input: " + sbf2 );
	
	StringBuilder sbf3 = new StringBuilder("This method returns the reversed object on which it was called");
	sbf3.reverse();
	System.out.println("Input: " + sbf3 );
}
}
