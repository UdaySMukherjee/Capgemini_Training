package MethodReference;

public class Driver {
	public static void main(String[] args) {
		//Operation o = Calci::add;
		Operation o = Calci::new;
		o.operate();
		//Operation p = new Calci()::sub;
		//int res = o.operate(10, 20);
		//int res2 = p.operate(10, 20);
		//System.out.println(res); 
		//System.out.println(res2);
	}
}
