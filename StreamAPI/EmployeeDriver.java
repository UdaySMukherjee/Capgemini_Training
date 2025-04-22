package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDriver {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
		empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
		empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
		empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
		empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
		empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
		empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
		empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
		empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));
		System.out.println("Print all details of employees : ");
		empList.forEach(s -> System.out.println(s));
		System.out.println("Print all details of employee group by city : ");
		System.out.println(empList.stream().collect(Collectors.groupingBy(Employee::getCity)).toString());
		System.out.println("Print all details of employee group by age : ");
		System.out.println(empList.stream().collect(Collectors.groupingBy(Employee::getAge)).toString());
		System.out.println("Print names of all Departments : ");
		System.out.println(empList.stream().map(Employee::getDeptName).distinct().toList());
		System.out.println("Print all details of employee whose age is greater than 28 : ");
		System.out.println(empList.stream().filter(s->s.getAge()>28).toList());
		//System.out.println(empList.stream().map(Employee::getAge).max(Integer::compareTo).get());
		System.out.println("Detail of employee with maximum age : ");
		System.out.println(empList.stream().max((e1,e2)->e1.getAge()-e2.getAge()).get());
		System.out.println("Youngest Female Employee : ");
		System.out.println(empList.stream().filter(s->s.getGender()=="F").min((e1,e2)->e1.getAge()-e2.getAge()).get());
		System.out.println("Find employee whose age is >25 and <30 : ");
		System.out.println("Find employee from HR Department : ");
		System.out.println("Find employee who live in Blore sort them by their name then print only the names of employees : ");
		System.out.println("Print total no. of employees : ");
		System.out.println("Sort employees based on age : ");
		System.out.println("Find the highest experienced employee (from year of joining): ");
		System.out.println("Find the highest salary : ");
	}
}
