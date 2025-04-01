package ObjectClass;

import java.util.Objects;

public class Student {
	int id;
	String name;
	double percntage;
	
	Student(int id,String name,double percntage){
		this.id  = id;
		this.name = name;
		this.percntage = percntage;
	}
	
	@Override
	public String toString() {
		return "Student[ID :"+this.id+
				" Name :"+this.name+
				" Percentage :"+this.percntage+"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s = (Student)obj;
		return this.id==s.id &&
				this.name==s.name &&
				this.percntage==s.percntage;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.id,
				this.name,
				this.percntage);
	}

}
