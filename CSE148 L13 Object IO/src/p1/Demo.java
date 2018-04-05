package p1;

public class Demo {

	public static void main(String[] args) {
//		Student s1 = new Student("AA", "M", 1.0);
//		Student s2 = new Student("BB", "F", 3.0);
//		Student s3 = new Student("CC", "G", 4.0);
//		
//		PersonBag theBag = new PersonBag(10);
//		theBag.add(s1);
//		theBag.add(s3);
//		theBag.add(s2);
//		
//		theBag.display();
//		
//		theBag.save();
		
		PersonBag theBag = new PersonBag(10);
		theBag.load();
		theBag.display();
		
	}

}
