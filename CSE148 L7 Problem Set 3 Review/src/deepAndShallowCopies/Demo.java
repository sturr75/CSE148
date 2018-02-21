package deepAndShallowCopies;

public class Demo {

	public static void main(String[] args) {
		Person p1 = new Person("John", 20);
		Person p2 = new Person(p1);
		System.out.println(Person.getIdNumber());
		System.out.println(Person.getIdNumber());
		
//		p1.setIdNumber(1);
//		System.out.println("p1's id: " + p1.getId());
//		
//		System.out.println("p2's id: " + p2.getId());
//		
//		System.out.println(p1.getIdNumber());
//		System.out.println(p2.getIdNumber());
//		
//		//--------
//		Person p3 = p1.shallowCopy(p1);
////		p3.setName("Bob");
//		System.out.println(p1 == p3);
//		System.out.println(p1.getName());
//		
//		// -------
//		Person p4 = p1.deepCopy(p1);
//		p4.setName("Bob");
//		System.out.println(p1 == p4);
//		System.out.println(p1.getName());
	}

}
