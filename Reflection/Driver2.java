package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Driver2 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<Person> c = Person.class;
//		Package package_name = c.getPackage();
//		System.out.println(package_name);
//		
//		Constructor<Person> cons = c.getConstructor();
//		System.out.println(cons);
//		
//		Constructor<?>[] cons1 = c.getConstructors();
//		for (Constructor<?> constructor : cons1) {
//			System.out.println(constructor);
//		}
		
//		System.out.println("default const");
//		Constructor<Person> cons1 = c.getDeclaredConstructor();
//		System.out.println(cons1);

		
//		System.out.println("when argument is known");
//		Constructor<Person> cons2 = c.getDeclaredConstructor(String.class,int.class);
//		System.out.println(cons2);
//		
//		System.out.println("fetch all the costructors");
//		Constructor<?>[] cons3 = c.getDeclaredConstructors();
//		for (Constructor<?> constructor : cons3) {
//			System.out.println(constructor);
//		}
		
		System.out.println("new default const");
		Constructor<Person> cons1 = c.getDeclaredConstructor();
		cons1.setAccessible(true);
		Person p = cons1.newInstance();
		System.out.println(p);
		
		System.out.println("new const");
		Constructor<Person> cons2 = c.getDeclaredConstructor(String.class,int.class);
		Person p1 = cons2.newInstance("Dinga",69);
		System.out.println(p1);
		
	}

	
}
