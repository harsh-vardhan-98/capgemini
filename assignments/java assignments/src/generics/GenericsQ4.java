package generics;

import java.util.HashMap;
import java.util.Map;

class Pair<K , V>{
	
	private Map<K,V> map = new HashMap<>(); 
	private K key;
	private V value;
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
	
	public void addKeyValue() {
		map.put(this.key, this.value);
	}
	
	public V getValue(K key) {
		return map.get(key);
	}
	
	
	
}

public class GenericsQ4 {
	public static void main(String[] args) {
		Pair<String,String> pair = new Pair<>();
		
		pair.setKey("Harsh");
		pair.setValue("Vardhan");
		pair.addKeyValue();
		System.out.println(pair.getValue("Harsh"));

		pair.setKey("Singh");
		pair.setValue("Kaurav");
		pair.addKeyValue();
		System.out.println(pair.getValue("Singh"));

	}
}