package Reflection;

public class Person {
	private String name;
	private int age;
	
//	public Person() {
//		System.out.println("no arggs cons");
//	}
	@SuppressWarnings("unused")
	private Person() {
		System.out.println("no arggs cons1");
	}
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getDetails() {
		return name+"\t"+age;
	}
	
	@SuppressWarnings("unused")
	private static void task(String task) {
		System.out.println("Doing task"+task);
	}
	
	@Override
	public String toString() {
		return "Person[Name: "+name+", Age: "+age+"]";
	}
}
