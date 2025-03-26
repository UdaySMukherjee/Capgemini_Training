package SingleLevel;

public class Student extends Person{
	private int studentID;
	
	Student(int studentID, String name, int age){
		super(name,age);
		this.studentID= studentID;
	}
//	
//	public void setStudentID(int studentID) {
//		this.studentID = studentID;
//	}
//	
//	public int getStudentID() {
//		return studentID;
//	}
	void displayDetails() {
		super.displayParentDetails();
		System.out.print("studentID: "+this.studentID);
	}
}
