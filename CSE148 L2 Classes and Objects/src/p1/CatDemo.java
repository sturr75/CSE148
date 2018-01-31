package p1;

public class CatDemo {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		System.out.println(cat1.getName());
		System.out.println(cat1.getAge());
		System.out.println("-----------");
		cat1.setName("Julie");
		cat1.setAge(10);
		System.out.println(cat1.getName());
		System.out.println(cat1.getAge());
	}

}
