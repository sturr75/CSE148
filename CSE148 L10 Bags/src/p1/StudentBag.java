package p1;

public class StudentBag {
	private Student[] studentArray;
	private int nItems = 0;

	public StudentBag(int maxSize) {
		studentArray = new Student[maxSize];
	}

	public Student findByName(String name) {
		for (int i = 0; i < nItems; i++) {
			if (studentArray[i].getName().equals(name)) {
				return studentArray[i];
			}
		}
		return null;
	}

	public Student removeById(String id) {
		int i;
		for (i = 0; i < nItems; i++) {
			if (studentArray[i].getId().equals(id)) {
				break;
			}
		}

		if (i == nItems) {
			return null;
		} else {
			Student temp = studentArray[i];
			for (int j = i; j < nItems - 1; j++) {
				studentArray[j] = studentArray[j + 1];
			}
			nItems--;
			return temp;

		}
	}

	public void insert(Student student) {
		studentArray[nItems++] = student;
	}

	public void display() {
		for (int i = 0; i < nItems; i++) {
			System.out.println(studentArray[i]);
		}
	}
}
