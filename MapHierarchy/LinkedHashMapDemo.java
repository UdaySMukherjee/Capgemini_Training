package HaspMapImplemntation;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hashmap = new LinkedHashMap<Integer, String>();
		hashmap.put(1, "Bhargav");
		hashmap.put(5, "Bisojit");
		hashmap.put(8, "Aniket");
		hashmap.put(4, "Prateek");
		hashmap.put(7, "Chakka");

		Set<Integer> keyset = hashmap.keySet();
		for(int key : keyset) {
			System.out.println(key+"\t"+hashmap.get(key));
		}
	}
}
