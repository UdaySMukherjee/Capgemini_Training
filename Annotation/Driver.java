package Annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Role: ");
			String role = sc.next();
			System.out.print("Enter method name: ");
			String method_name = sc.next();
			Task task = new Task();
			userValidCheck(role, method_name, task);
		}
	}

	public static void userValidCheck(String role_by_user, String method_name, Task t) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<Task> c = Task.class;
		Method m = c.getMethod(method_name);

		if(m.isAnnotationPresent(Role.class)) {
			Role role = m.getAnnotation(Role.class);
			if(role.value().equals(role_by_user)) {
				m.invoke(t);
			}else {
				System.out.println("Not valid......Don't have access");
			}
		}
	}
}