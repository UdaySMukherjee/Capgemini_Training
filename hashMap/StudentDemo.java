package HaspMapImplemntation;

import java.util.HashMap;

public class StudentDemo {
	public static void main(String[] args) {
		HashMap<Integer, Student> hashmap = new HashMap<Integer, Student>();
		hashmap.put(1, new Student(101, "Ankan", 80.65));
		hashmap.put(5, new Student(101, "Ankan", 80.65));
		hashmap.put(7, new Student(101, "Ankan", 80.65));
		hashmap.put(2, new Student(101, "Ankan", 80.65));
		hashmap.put(9, new Student(101, "Ankan", 80.65));
		hashmap.put(6, new Student(101, "Ankan", 80.65));
		System.out.println(hashmap);
	}
}
