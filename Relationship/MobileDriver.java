package Relationship;

public class MobileDriver {
	//lazy instantiation
	public static void main(String[] args) {
		Mobile mob = new Mobile();
		System.out.println(mob);
		System.out.println(mob.sim);
		mob.createSim();
		System.out.println(mob.sim);
	}
}
