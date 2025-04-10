package hashMap;

public class HashMapDriver {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(1, "ankan");
		map.put(5, "soham");
		map.put(7, "uday");
		map.put(8, "bhaskar");
		map.put(6, "rangan");
		map.put(9, "ritankar");
		map.put(0, "mkc");
		map.display();
		System.out.println(map.getSize());
	}
}
