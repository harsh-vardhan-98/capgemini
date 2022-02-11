package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(20);
		list.add(20);
		list.add(10);
		
		list.add(3, 30);
		list.set(0, 100);
		
		Iterator<Integer> lst = list.iterator();
		while(lst.hasNext()) {
			System.out.println(lst.next());
		}
		
//		System.out.println("----------------------");
//		Collection.sort(list);
		list.sort(null);
		
		Iterator<Integer> lst1 = list.iterator();
		while(lst1.hasNext()) {
			System.out.println(lst1.next());
		}
		
	
	
	
	
	}

}
