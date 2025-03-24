package OneToMany;

public class Class {
	
	private int grade;
	private Student[] students = new Student[20];
	
	Class(int grade) {
		this.grade = grade;
	}
	
	public int getGrade() {
		return grade;
	}
	public Student[] getStudent() {
		return students;
	}
	
	int i = 0;
	void addStudent(String name) {
		students[i]= new Student(name);
		i++;
	}
	
	void display() {
		for(Student s : students) {
			if(s!=null)
				System.out.println(s.getName());
		}
	}

}
