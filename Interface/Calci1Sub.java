package Interface;

public class Calci1Sub extends BasicCalciSub implements Calci1{
	@Override
	double power(double a,double b) {
		return Math.pow(a, b);
	}
}
