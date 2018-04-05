package p1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class PersonBag {
	private Person[] personArray;
	private int nElems;
	
	public PersonBag(int maxSize) {
		personArray = new Person[maxSize];
		nElems = 0;
	}
	
	public void importData(String fileName) {
		File file = new File(fileName);
		try {
			Scanner in = new Scanner(file);
			while (in.hasNextLine()) {
				String data = in.nextLine();
				String[] tokens = data.split("[ ;,]");
				Student s = new Student(tokens[0], tokens[1], Double.parseDouble(tokens[2]));
				add(s);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void exportData(String fileName) {
		
	}
	
	public void load() {
		FileInputStream fis;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("PersonArray.dat");
			ois = new ObjectInputStream(fis);
			personArray = (Person[])ois.readObject();
			nElems = (Integer)ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void save() {
		ObjectOutputStream oos = null;
		try {
			FileOutputStream fos = new FileOutputStream("PersonArray.dat");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(personArray);
			oos.writeObject(nElems);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void add(Person p) {
		personArray[nElems++] = p;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(personArray[i]);
		}
		System.out.println();
	}

}
