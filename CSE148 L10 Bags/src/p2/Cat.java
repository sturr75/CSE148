package p2;

import p1.Student;

public class Cat extends Pet {
	private double weight;

	public Cat(String name, int age, double weight) {
		super(name, age);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Cat [Name=" + getName() + ", Age=" + getAge() + ", weight=" + weight + "]";
	}
	
	

}
