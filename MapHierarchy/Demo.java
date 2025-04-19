package MapHierarchy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		HashMap< Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(1, "Bhargav");
		hashmap.put(5, "Bisojit");
		hashmap.put(8, "Aniket");
		hashmap.put(4, "Prateek");
//		hashmap.put(null, null);
//		hashmap.put(null,"true");
		hashmap.put(5, "Chakka");
		System.out.println(hashmap);
		System.out.println(hashmap.containsKey(5));
		System.out.println(hashmap.containsValue("Bhargav"));
		System.out.println(hashmap.get(5));
		System.out.println(hashmap.getOrDefault(100, "Bhaskar"));
		
		Set<Map.Entry<Integer, String>> entryset = hashmap.entrySet();
		for(Map.Entry<Integer,String> entry: entryset) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		System.out.println();
		Set<Integer> keyset = hashmap.keySet();
		for(int key : keyset) {
			System.out.println(key+"\t"+hashmap.get(key));
		}
	}
}
