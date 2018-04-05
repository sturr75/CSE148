package binaryIO;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBinaryFile {

	public static void main(String[] args) {
		int[] numbers = { 2, 4, 6, 8, 10, 12, 14 };

		FileOutputStream fos;
		try {
			fos = new FileOutputStream("numbers.dat");
			DataOutputStream dos = new DataOutputStream(fos);
			for(int num : numbers) {
				dos.writeInt(num);
			}
			dos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done writing!");
	}
}
