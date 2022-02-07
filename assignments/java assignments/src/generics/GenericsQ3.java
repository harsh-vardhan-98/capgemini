package generics;

import java.util.ArrayList;

class Test{
	
	public <Integer> void swap(ArrayList<java.lang.Integer> arr1 ,  int item1, int   item2) {
		
		Integer temp = arr1[item1];
		arr1[item1] = arr1[item2];
		arr1[item2] = temp;
		
		
		
	}
}


public class GenericsQ3 {
	public static <T> void main(String[] args) {
		
		Test t = new Test();
		ArrayList <Integer> arr1 = new ArrayList<>();
		arr1.add(1);
		arr1.add(3);
		arr1.add(2);
		
		t.swap(arr1, 1, 2);
		
		
	}
	

}
