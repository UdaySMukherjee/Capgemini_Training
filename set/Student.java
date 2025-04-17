package set;

import java.util.Objects;

public class Student {
	private int id;
	private String name;
	private double percentage;
	
	Student(int id,String name,double percentage){
		this.name = name;
		this.id = id;
		this.percentage = percentage;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public double getPercentage() {
		return this.percentage;
	}
	
	@Override
	public String toString() {
		return "Student[ID: "+this.id+" Name: "+this.name+" Percentage: "+this.percentage+"]\n";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.id,this.name,this.percentage);
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s = (Student)obj;
		return this.id==s.id && this.name.equals(s.name) && this.percentage==s.percentage;
	}
}
