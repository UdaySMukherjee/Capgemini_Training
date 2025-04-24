package Annotation;

public class Task {
	@Role("user")
	public void userTask() {
		System.out.println("User task");
	}
	@Role("admin")
	public void adminTask() {
		System.out.println("Admin Task");
	}
	public static void main(String[] args) {
		System.out.println("Main");
	}
}
