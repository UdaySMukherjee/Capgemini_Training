package Reflection;

import java.lang.reflect.Field;

public class Driver5 {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		Class<Person> c = Person.class;
		System.out.println("Get all variables");
		Field[] all_var = c.getDeclaredFields();
		for (Field field : all_var) {
			System.out.println(field);
		}
		
		System.out.println("get specified var");
		Field f = c.getDeclaredField("age");
		System.out.println(f);
	}
}
