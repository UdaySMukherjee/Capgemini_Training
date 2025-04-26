package JsonHandle;

public class Teacher{
	private String name;
	private int experience;
	
	Teacher(){}
	Teacher(String name,int experience){
		this.setName(name);
		this.setExperience(experience);
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
