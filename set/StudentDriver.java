package set;

import java.util.HashSet;

public class StudentDriver {
	public static void main(String[] args) {
		HashSet<Student> h = new HashSet<Student>();
		h.add(new Student(103,"Uday",89.0));
		h.add(new Student(101,"Ankan",99.0));
		h.add(new Student(102,"Soham",97.5));
		h.add(new Student(103,"Uday",89.0));
		h.add(new Student(103,"Uday",89.0));
		System.out.println(h);
	}
}
