package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Order{
	private int price;
	private String status;
	public Order(int price, String status) {
		super();
		this.price = price;
		this.status = status;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String toString() {
		return "Price : "+ price+" and order is: "+status;
		
	}
}

public class Question2 {
	
	public static void main(String[] args) {
			
		ArrayList<Order> list = new ArrayList<>(List.of(
				new Order(11000,"accepted"),
				new Order(12000, "not accepted"),
				new Order(13000, "not completed"),
				new Order(7000, "completed"),
				new Order(8000, "not accepted"),
				new Order(9000, "accepted")
				));

		printAllWithCondition(list , o->true);
		System.out.println("-----------------------------------------");
		printAllWithCondition(list, o->o.getPrice()>10000 && (o.getStatus() == "accepted" || o.getStatus() == "completed"));
	}

	private static void printAllWithCondition(ArrayList<Order> list , Condition condition) {
		for(Order o : list) {
			if(condition.test(o)) {
				System.out.println(o);				
			}
		}
	}
}

interface  Condition{
	boolean test(Order o);
}
