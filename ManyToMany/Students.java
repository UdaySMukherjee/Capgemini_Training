package ManyToMany;

public class Students {
	private String name;
	private Subjects[] subjects = new Subjects[10];
	
	public Students(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	void display() {
		for(Subjects sub: subjects) {
			if(sub!=null)
				System.out.println(sub.getName());
		}
	}
	
	int count=0;
	void addSubjects(Subjects subjects) {
		for(int i = 0;i<this.subjects.length;i++) {
			if(this.subjects[i]!=null)
				count++;
		}if(count<9) {
			count++;
			this.subjects[count] = subjects;
			subjects.addStudent(this);
		}else {
			System.out.println("Maximum occupancy");
		}
	}
}
