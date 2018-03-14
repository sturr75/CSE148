package functionalMethods;

public class Demo {

	public static void main(String[] args) {
		// lambda expression
		Calculator multiply = () -> {
			return 2 * 3;
		};
		Calculator add = (n1, n2) -> {
			return n1 + n2;
		};
		Calculator subtract = (n1, n2) -> {
			return n1 - n2;
		};
		Calculator divide = (n1, n2) -> {
			return n1 / n2;
		};
		
		System.out.println("the sum is: " + add.calculate(2,  5));
		System.out.println("the difference is: " + subtract.calculate(2,  5));
		System.out.println("the product is: " + multiply.calculate(2,  5));
		System.out.println("the quotient is: " + divide.calculate(2,  5));
	}

}
