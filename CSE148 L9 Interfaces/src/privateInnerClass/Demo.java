package privateInnerClass;

public class Demo {

	public static void main(String[] args) {
		Computer c1 = new Computer();
		c1.calculate(1, 2);
	}

	private class Computer implements Calculator {
		
		@Override
		public double calculate(double num1, double num2) {
			return 0;
		}
	}
}
