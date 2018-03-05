package p2;

public class Demo {

	public static void main(String[] args) {
		Address address = new Address("1", "Main Street", "Selden", "New York", "11784");
		Student s1 = new Student("Adam", 1, 3.5, address);
		System.out.println(s1);
		Address a = s1.getAddress();
		a.setStreetNumber("2");
		System.out.println(s1);
		s1.setGpa(s1.curveGPA(0.2));
		System.out.println(s1);
		
		
	}

}
