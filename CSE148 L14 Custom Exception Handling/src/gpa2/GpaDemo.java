package gpa2;

public class GpaDemo {

	public static void main(String[] args)  {
		Student s1 = null;
		String name = null;
		
		double gpa = -30;
			try {
				s1 = new Student(name, gpa);
			} catch (Exception e) {
				if(gpa > 4.0) {
					try {
						s1 = new Student(name, 4.0);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				} else {
					try {
						s1 = new Student(name, 0.0);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		System.out.println(s1);
	}

}
