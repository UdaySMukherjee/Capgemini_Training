package ComparableInterface;

import java.util.Arrays;

public class StudentDriver {
	public static void main(String[] args) {
		Student[] students = {
				new Student(1, "Bhaskar", 99.99),
				new Student(4, "Suman", 97.99),
				new Student(5, "Mouli", 98.99),
				new Student(2, "Saakshi", 97.86),
		};
		
		Arrays.sort(students);
	
		for(Student student: students) {
			System.out.println(student);
		}
	}
}
