package gpa;

public class GpaDemo {

	public static void main(String[] args) {
		Student s1 = new Student("Adam", 5.0);
		System.out.println(s1);
		s1.setGpa(-30);
		System.out.println(s1);
	}

}
