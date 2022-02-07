package collections;
import java.util.*;
public class Question2 {
	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet<>(10);
		h.add(3);
		h.add(56);
		h.add(89);
		h.add(21);
		h.add(74);
		h.add(37);
		h.add(31);
		h.add(45);
		h.add(20);
		h.add(3);
		System.out.println(h);
		h.add(1);
		System.out.println(h);
		Iterator<Integer> itr=h.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
	
	}

}
