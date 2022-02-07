package collections;

import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;

class Contact{
	private long phone;
	private String name;
	private String email;
	private String g;
	public Contact(long phone, String name, String email, String g) {
		
		this.phone = phone;
		this.name = name;
		this.email = email;
		this.g = g;
	}
	public long getPhone() {
		return phone;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getG() {
		return g;
	}
	
	
	
	
	
	
}


public class Question1 {

	public static void main(String[] args) {
		TreeMap<Long ,Contact> map = new TreeMap<>(Collections.reverseOrder());
		Contact c1 = new Contact(27017 , "Harsh", "harsh@gmail" , "Male");
		Contact c2 = new Contact(27018 , "vardhan", "vardhan@gmail" , "Male");
		Contact c3 = new Contact(27019 , "singh", "singh@gmail" , "Male");
		Contact c4 = new Contact(27020 , "kaurav", "kaurav@gmail" , "Male");
		
		map.put(c1.getPhone(),c1);
		map.put(c2.getPhone(),c2);
		map.put(c3.getPhone(),c3);
		map.put(c4.getPhone(),c4);
		
//		System.out.println(map.keySet());
//		System.out.println(map.values());
		
//		for(Map.Entry<Long, Contact> m : map.entrySet()) {
//			System.out.println(m.getKey()+ " "+ m.getValue());
//		}
		for(Map.Entry<Long, Contact> m : map.entrySet()) {
			Contact c = m.getValue();
			
			System.out.println(m.getKey()+ " "+ c.getName()+" "+c.getEmail()+" "+c.getPhone()+" "+c.getG());
		}	
	
	}

}
