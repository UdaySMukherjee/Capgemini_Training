package ArrayListCollection;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id,String name,double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	@Override
	public String toString() {
		return "Employee [ID: "+this.id+", Name: "+this.name+", Salary: "+this.salary+"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee)obj;
		return this.id == emp.id && this.name == emp.name && this.salary == emp.salary;
	}
	
	@Override
	public int compareTo(Employee o) {
		return this.id - o.id;
	}
}
