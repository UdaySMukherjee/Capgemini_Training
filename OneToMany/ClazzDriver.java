package OneToMany;

public class ClazzDriver {
	public static void main(String[] args) {
		Class clazz = new Class(10);
		clazz.addStudent("Uday");
		clazz.addStudent("Soham");
		clazz.addStudent("Ankan");
		clazz.display();
	}
	
	
}
