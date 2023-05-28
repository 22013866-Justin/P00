
public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int substract(int a, int b) {
		return a - b;
	}
	
	public int multiple(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		if (b == 0) {
			throw new java.lang.ArithmeticException("cant divide by zero");

		}
		return a / b;
	}
}
