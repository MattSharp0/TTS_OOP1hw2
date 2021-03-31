package calculator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		MagicCalculator mCalc = new MagicCalculator();
		
		
		System.out.println(calc.add(5, 10));
		
		System.out.println(calc.subtract(9, 10));
		
		System.out.println(mCalc.factorial(5));
	}
	
	

}
