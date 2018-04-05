package binaryIO;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadBinaryFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("numbers.dat");
		DataInputStream dis = new DataInputStream(fis);
		boolean endOfFile = false;

		while (!endOfFile) {
			try {
				int x = dis.readInt();
				System.out.println(x);
			} catch (EOFException e) {
				endOfFile = true;
			}
		}
		dis.close();
		System.out.println("Done reading!");

	}

}
