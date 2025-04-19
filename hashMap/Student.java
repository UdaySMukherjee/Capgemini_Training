package HaspMapImplemntation;

public class Student {
	private int id;
	private String Name;
	private double percentage;
	
	Student(int id,String Name,double percentage){
		this.id=id;
		this.Name=Name;
		this.percentage=percentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	
}
