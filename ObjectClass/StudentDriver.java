package ObjectClass;

public class StudentDriver {
	public static void main(String[] args) {
		Student s = new Student(12345, "Ankan", 69.69);
		Student s1 = new Student(56789, "Soham", 98.67);
		System.out.println(s.toString());
		System.out.println(s1.toString());
		System.out.println(s.equals(s1));
		System.out.println(s1.equals(s1));
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}

}
