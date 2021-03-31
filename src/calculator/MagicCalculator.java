package calculator;

public class MagicCalculator extends Calculator {
	
	public double squareRoot(int num1) {
		return Math.sqrt(num1);
	}
	
	public double sin(int num1) {
		return Math.sin(num1);
	}
	
	public double cosine(int num1) {
		return Math.cos(num1);
	}
	
	public double tangent(int num1) {
		return Math.tan(num1);
	}
	
	public double factorial(int num1) {
		int f =1; 
		for (int i = 2; i <= num1; i++)
			f *= i;
		return f;
	}
}
