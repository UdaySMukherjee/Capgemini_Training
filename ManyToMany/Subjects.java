package ManyToMany;

public class Subjects {
	
	private String name;
	private Students[] students = new Students[10];
	
	public Subjects(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	void display() {
		for(Students stud: students){
			if(stud!=null) {
				System.out.println(stud.getName());
			}
		}
	}
	
	int count=0;
	void addStudent(Students stud) {
		for(int i = 0;i<students.length;i++) {
			if(students[i]!=null)
				count++;
		}if(count<9) {
			count++;
			students[count] = stud;
		}else {
			System.out.println("Maximum occupancy");
		}
	}
}
