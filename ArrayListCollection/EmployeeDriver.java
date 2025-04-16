package ArrayListCollection;

import java.util.Scanner;

public class EmployeeDriver {
	public static void main(String[] args) {
		System.out.println("\t\tWelcome to Employee Management System\t\t");
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("\n1. Add Employee");
			System.out.println("2. Print All Employee");
			System.out.println("3. Search Employee");
			System.out.println("4. Search Employee by ID");
			System.out.println("5. Delete Employee");
			System.out.println("6. Delete Employee by ID");
			System.out.println("7. Update Employee by ID");
			System.out.println("8. Sort Employee based on ID");

			System.out.print("\nEnter your Choice: ");
			int choice = sc.nextInt();

			switch(choice) {
			case 1:
				Employee emp = createEmployeeObject(sc);
				Employees.addEmployee(emp);
				break;
			case 2:
				System.out.println("List of Employees are: ");
				Employees.display();
				break;
			case 3:
				Employee employee = createEmployeeObject(sc);
				boolean result = Employees.searchEmployee(employee);
				if(result)
					System.out.println("Employee data Found");
				else
					System.out.println("Employee data Not Found");
				break;
			case 4:
				Employee result1 = Employees.searchEmployeeByID(sc);
				if(result1 == null) {
					System.out.println("Employee data not found!");
				}else {
					System.out.println(result1);
				}break;
			case 5:
				Employee emp1 = createEmployeeObject(sc);
				Employees.deleteEmployee(emp1);
				break;
			case 6:
				Employees.deleteEmployeeByID(sc);
				break;
			case 7:
				Employee emp2 = createEmployeeObject(sc);
				Employees.updateEmployeeObject(emp2);
				break;
			case 8:
				Employees.sort();
				break;
			default:
				System.exit(0);
			}
		}
	}

	

	private static Employee createEmployeeObject(Scanner sc) {
		System.out.println("Enter ID, Name, Salary");
		Employee emp = new Employee(sc.nextInt(),sc.next(),sc.nextDouble());
		return emp;
	}
}
