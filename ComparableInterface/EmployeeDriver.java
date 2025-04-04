package ComparableInterface;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee employee1 = new Employee(319, "Bhaskar", 15000.99);
		Employee employee2 = new Employee(477, "Suman", 9567.99);
		Employee employee3 = new Employee(565, "Mouli", 10098.99);
		Employee employee4 = new Employee(201, "Saakshi", 45697.86);
		System.out.println(employee1.compareTo(employee1));
		System.out.println(employee1.compareTo(employee2));
		System.out.println(employee1.compareTo(employee3));
		System.out.println(employee1.compareTo(employee4));
	}

}
