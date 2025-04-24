package Reflection;

public class Driver {
	public static void main(String[] args) throws ClassCastException, ClassNotFoundException {
		Class<Person> c = Person.class;
		
		Class<Person> c1 = (Class<Person>) new Person("Dinga",30).getClass();
		
		Class<Person> c2 = (Class<Person>) Class.forName("Reflection.Person");
	}
}
