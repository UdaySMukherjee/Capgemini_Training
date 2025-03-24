package OneToOne;

public class PassportDriver {
	
	public static void main(String[] args) {
		Passport passport = new Passport("3466877089");
		Person person = new Person("biswajit", passport);
		
		System.out.println(person.getName());
		System.out.println(person.getPassport().getPassport_number());
	}
}
