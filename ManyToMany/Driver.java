package ManyToMany;

public class Driver {
	public static void main(String[] args) {
		Students student1 = new Students("Soham");
		Students student2 = new Students("Uday");
		Students student3 = new Students("Ankan");
		
		Subjects subject1 = new Subjects("Java");
		Subjects subject2 = new Subjects("Python");
		Subjects subject3 = new Subjects("C++");
		
		student1.addSubjects(subject3);
		student1.addSubjects(subject2);
		student1.addSubjects(subject1);
		student2.addSubjects(subject3);
		student3.addSubjects(subject1);
		
		System.out.println(student1.getName()+" with subjects are");
		student1.display();
		System.out.println(student2.getName()+" with subjects are");
		student2.display();
		System.out.println(student3.getName()+" with subjects are");
		student3.display();
		
		System.out.println("Student list for "+subject1.getName()+" are");
		subject1.display();
		System.out.println("Student list for "+subject2.getName()+" are");
		subject2.display();
		System.out.println("Student list for "+subject3.getName()+" are");
		subject3.display();
	}

}
