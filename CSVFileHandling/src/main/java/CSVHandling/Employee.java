package CSVHandling;

import com.opencsv.bean.CsvBindByName;

public class Employee {
	@CsvBindByName(column="Employee_name")
	private String name;
	@CsvBindByName(column="Employee_age")
	private int age;
	@CsvBindByName(column="Employee_salary")
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public Employee() {
	
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
}
