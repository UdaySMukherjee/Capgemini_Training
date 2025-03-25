package Inheritance;

public class AnimalDriver {
	public static void main(String[] args) {
		Dog ch = new Dog();
		System.out.println(ch.b);
		System.out.println(ch.a);
		System.out.println(ch.y);
		System.out.println(ch.x);
		ch.methodOfParent();
		ch.methodOfChild();

		Animal animal = new Animal();
		System.out.println(animal.x);
		animal.methodOfParent();

	}
}
