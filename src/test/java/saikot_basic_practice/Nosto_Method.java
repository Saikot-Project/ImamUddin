package saikot_basic_practice;

public class Nosto_Method {

	public int subNumbers (int a, int b) {
		int sub = a+b;
		System.out.println("Subtraction result is " + sub);
		return sub;
	}
	public int addNumbers (int b, int c, double d ) {
		double add = (b +c +d);
		System.out.println("Additional result is " + add);
		return 0;
	}
	public static void mulNumbers (int e , int f, int g) {
		int mul = (e * f* g);
		System.out.println("Multiplication result is " + mul);
	}

	public static void main(String[] args) {
		Nosto_Method obj = new Nosto_Method(); // object obj1 creation
		
		obj.subNumbers(80, 30);
		obj.addNumbers(50, 25, 20.55);
		Nosto_Method.mulNumbers(8, 10, 4);
		
	}

}
