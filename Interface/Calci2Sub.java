package Interface;

public class Calci2Sub extends BasicCalciSub implements Calci2{
	@Override
	public double square(double a) {
		return Math.pow(a, 2);
	}
	@Override
	public double cube(double a) {
		return Math.pow(a, 3);
	}
}
