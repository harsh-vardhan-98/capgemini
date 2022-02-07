package generics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//class Pair<Integer,Double>{
//	
//	private Integer key;
//	private Double value;
//	public Pair(Integer key, Double value) {
//		super();
//		this.key = key;
//		this.value = value;
//	}
//	
//	public void display() {
//		System.out.println("Key: "+key+" Value: "+value);
//	}
//}

public class GenericsQ2 {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		Map<Integer,Double> map = new HashMap<>();
		
		for (int i =0;i<3;i++) {
			int key = input.nextInt();
			double value = input.nextDouble();
			map.put(key,value);
		}
		
		for(Integer m : map.keySet()) {
			System.out.println("Key: "+m);	
		}
		System.out.println("---------------------------------");
		for (Double m: map.values()) {
			System.out.println(" Value: "+ m);
		}
		
	
		
		
//		Pair<Integer , Double> p1 = new Pair<Integer , Double>(10 ,100.00);
//		Pair<Integer , Double> p2 = new Pair<Integer, Double>(11 , 110.00);
//		
//		Set <Pair> set1 = new HashSet<>();
//		set1.add(p1);
//		set1.add(p2);
//		
//		
//		for(Pair p : set1) {
//			p.display();
//		}
//		
//	}
	}
}
