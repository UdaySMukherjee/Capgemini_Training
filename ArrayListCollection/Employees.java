package ArrayListCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Employees {
	static ArrayList<Employee> list_of_emp = new ArrayList<Employee>();
	
	static {
		list_of_emp.add(new Employee(101, "Ankan", 10000));
		list_of_emp.add(new Employee(105, "Soham", 20000));
		list_of_emp.add(new Employee(103, "Uday", 30000));
	}
//	static List<Employee> list_of_emp = List.of(
//			new Employee(101,"Ankan",10000),
//			new Employee(102,"Soham",20000),
//			new Employee(103,"Uday",30000));
	
	public static void addEmployee(Employee emp) {
		list_of_emp.add(emp);
		System.out.println("Employee Added Successfully\n");
	}
	
	public static void display() {
//		for(Employee e:list_of_emp) {
//			System.out.println(e);
//		}
		//using iterator
//		Iterator<Employee> itr =list_of_emp.iterator();
//		while(itr.hasNext()) {
//			Employee emp = itr.next();
//			System.out.println(emp);
//		}
		//using listiterator
		ListIterator<Employee> list_itr = list_of_emp.listIterator(list_of_emp.size());
		while(list_itr.hasPrevious()) {
			Employee emp = list_itr.previous();
			System.out.println(emp);
		}
	}
	public static boolean searchEmployee(Employee emp) {
		if(list_of_emp.contains(emp)) {
			return true;
		}return false;
	}
	
	public static Employee searchEmployeeByID(Scanner sc) {
		System.out.println("Enter the ID to search: ");
		int ID = sc.nextInt();
		Iterator<Employee> itr =list_of_emp.iterator();
		while(itr.hasNext()) {
			Employee emp = itr.next();
			if(emp.getId() == ID) {
				System.out.print("Employee found at: ");
				return emp;
			}
		}return null;
	}
	
	public static void deleteEmployee(Employee emp) {
		list_of_emp.remove(emp);
		System.out.println("Employee Deleted");
	}
	public static void deleteEmployeeByID(Scanner sc) {
		System.out.println("Enter the ID to search: ");
		int ID = sc.nextInt();
//		for (Employee employee : list_of_emp) {
//			if(employee.getId()==ID) {
////				list_of_emp.remove(ID); //ConcurrentModificationException
//			}
//		}
		Iterator<Employee> itr =list_of_emp.iterator();
		while(itr.hasNext()) {
			Employee emp = itr.next();
			if(emp.getId() == ID) {
				list_of_emp.remove(emp);
				System.out.print("Employee data Deleted ");
			}
		}
	}

	public static void updateEmployeeObject(Employee emp2) {
		Iterator<Employee> itr =list_of_emp.iterator();
		while(itr.hasNext()) {
			Employee emp = itr.next();
			if(emp.getId() == emp2.getId()) {
				emp.setName(emp2.getName());
				emp.setSalary(emp2.getSalary());
				System.out.print("Employee data Updated ");
			}
		}
		
	}

	public static void sort() {
		Collections.sort(list_of_emp);
//		Collections.sort(list_of_emp, new SortByName());
		for (Employee employee : list_of_emp) {
			System.out.println(employee);
		}
	}


}
