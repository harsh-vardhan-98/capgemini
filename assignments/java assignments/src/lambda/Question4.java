package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Question4 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(List.of("Mango" , "fish" , "apple" , "pear"));
		ArrayList<String>list1 =  printWithCondition(list , s->s.length()%2 != 0 );
		System.out.println(list1);
	}

	private static ArrayList<String> printWithCondition(ArrayList<String> list , Predicate<String> predicate) {
		list.removeIf(predicate);
		return list;
		
	}
}
