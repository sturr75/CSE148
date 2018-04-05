package p1;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0] = 11;
		numbers[1] = 22;
		numbers[2] = 33;
		numbers[3] = 44;
		numbers[4] = 55;
		
		try {  // try clause
			numbers[5] = 66;
			System.out.println("The number is: " + numbers[4]) ;
		} catch (ArrayIndexOutOfBoundsException ev) { // catchh clause
			System.out.println("Array Index out of bounds exception occurred");
		} catch (RuntimeException e) {
			System.out.println("Runtime exception occurred");
		} catch (Exception e) {
			System.out.println("Exception occurrred");
		} finally {
			System.out.println("Finally, we get here!");
		}
		System.out.println("The number is: " + numbers[1]);
	}

}
