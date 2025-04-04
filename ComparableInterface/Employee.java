package ComparableInterface;

public class Employee implements Comparable{
	int id;
	String name;
	double salary;
	
	Employee(int id,String name,double salary){
		this.id = id;
		this.name = name;
		this.salary=salary;
	}
	@Override
	public int compareTo(Object o) {
		Employee e = (Employee)o;
		if(this.id > e.id) {
			return 1;
		}if(this.id < e.id) {
			return -1;
		}else{
			return 0;
		}
	}
}
