class Swap{
	public static void main(String args[]){
		int a = 10;
		int b = 20;
		System.out.println("original a is "+a+" Original b is "+b);
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("Swapped a is "+a+" Swapped b is "+b);
	}
}