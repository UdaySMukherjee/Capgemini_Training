package SingleLevel;

public class Person {
	private String name;
	private int age;
	
	void displayParentDetails() {
		System.out.println("name: "+this.name);
		System.out.println("age: "+this.age);
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person(){}
	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	public int getAge() {
//		return age;
//	}
}
