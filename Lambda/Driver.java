package Lambda;

public class Driver {
	public static void main(String[] args) {
//		MyOperation m = (a,b) -> {
//			return a+b;
//		};
		MyOperation m = (a,b) -> a+b;
		int res = m.operate(10,20);
		System.out.println(res);
	}
}
