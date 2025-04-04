package ComparableInterface;

public class Student implements Comparable{
	int rollno;
	String name;
	double percentage;
	
	public Student(int rollno, String name, double percentage) {
		this.rollno=rollno;
		this.name=name;
		this.percentage=percentage;
	}
	@Override
	public String toString(){
		return rollno+"\t"+name+"\t"+percentage;
	}
	
	@Override
	public int compareTo(Object o) {
		Student s = (Student)o;
		return this.rollno-s.rollno;
	}
}
