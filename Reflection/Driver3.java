package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Driver3 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<Person> c = Person.class;
		Person p = new Person("Dinga", 40);
		System.out.println("no args method");
		Method m1 = c.getDeclaredMethod("getDetails");
		System.out.println(m1);
		m1.setAccessible(true);
		m1.invoke(p);
		
		System.out.println("args method");
		Method m2 = c.getDeclaredMethod("task", String.class);
		System.out.println(m2);
		m2.setAccessible(true);
		m2.invoke(null, "Training");
	}
}
