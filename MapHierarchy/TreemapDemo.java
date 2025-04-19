package HaspMapImplemntation;

import java.util.Set;
import java.util.TreeMap;

public class TreemapDemo {
	public static void main(String[] args) {
		TreeMap<Integer, String> hashmap = new TreeMap<Integer, String>();
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
