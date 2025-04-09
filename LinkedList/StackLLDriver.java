package Stackpackage;

public class StackLLDriver {
	public static void main(String[] args) {
		StackLL s = new StackLL();
		s.push(10);
		s.push(60);
		s.push(45);
		s.diplay();
		System.out.println(s.pop()+ " is popped!");
		s.diplay();
		System.out.println(s.peek()+" is at the top!");
		s.diplay();
	}
}
