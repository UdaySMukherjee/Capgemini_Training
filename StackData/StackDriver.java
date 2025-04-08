package StackData;

public class StackDriver {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(90);
		stack.display();
		System.out.println();
		System.out.println(stack.peek()+" is TOP");
		System.out.println();
		System.out.println(stack.pop()+" is popped");
		stack.push(70);
		stack.push(50);
		System.out.println(stack.pop()+" is popped");
		System.out.println();
		stack.display();
		System.out.println();
		System.out.println(stack.peek()+" is TOP");
		
	}
}
