package FileHandling;

import java.io.Serializable;

public class Employee implements Serializable {
	private int id;
	private double salary;
	private String name;
	
	Employee(int id,double salary,String name){
		this.id=id;
		this.salary=salary;
		this.name=name;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
