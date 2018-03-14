package anonymousClass;

public class Demo {

	public static void main(String[] args) {
		
		//anonymous class
		Calculator c1 = new Calculator() {

			@Override
			public double calculate(double num1, double num2) {
				return num1 * num2;
			}

			@Override
			public double calculate2(double num1, double num2) {
				return num1 / num2;
			}
			
		}; 
		System.out.println(c1.calculate(2, 5));
	}

}
