package Reflection;

import java.lang.reflect.Method;

public class Driver4 {
	public static void main(String[] args) {
		Class<Person> c = Person.class;
		System.out.println("returns all public methods of same class and super class as array");
		Method[] all_methods = c.getMethods();
		for(Method method: all_methods) {
			System.out.println(method);
		}
		System.out.println("returns all level methods of same class as array");
		Method[] same_class_methods = c.getDeclaredMethods();
		for(Method method2: same_class_methods) {
			System.out.println(method2);
		}
		System.out.println("super class methods");
		Class<Object> c2= (Class<Object>) c.getSuperclass();
		Method[] object_class_methods = c2.getDeclaredMethods();
		for (Method method : object_class_methods) {
			System.out.println(method);
		}
	}
}
