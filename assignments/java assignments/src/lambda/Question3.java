package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Question3 {
	public static void main(String[] args) {
		ArrayList<Order> list = new ArrayList<>(List.of(
				new Order(11000,"accepted"),
				new Order(12000, "not accepted"),
				new Order(13000, "not completed"),
				new Order(7000, "completed"),
				new Order(8000, "not accepted"),
				new Order(9000, "accepted")
				));
		
		printWithCondition(list, o->o.getPrice()<10000 && (o.getStatus() == "accepted" || o.getStatus() == "completed" ), o->System.out.println(o), ()->(int)(Math.random()*100));

	}

	private static void printWithCondition(ArrayList<Order> list , Predicate<Order> predicate , Consumer<Order> consumer , Supplier<Integer> supplier) {
		for (Order o :list) {
			if(predicate.test(o)) {
				System.out.println(supplier.get());
				consumer.accept(o);			
			}
		}
		
	}
}


