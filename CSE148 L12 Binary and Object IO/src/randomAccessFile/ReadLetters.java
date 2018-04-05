package randomAccessFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadLetters {

	public static void main(String[] args) throws IOException {
		final int CHAR_SIZE = 2;
		RandomAccessFile randomFile = new RandomAccessFile("letters.dat", "r");
		long byteNumber = CHAR_SIZE * 1;
		randomFile.seek(byteNumber);
		char ch = randomFile.readChar();
		System.out.println(ch);
		
		byteNumber = CHAR_SIZE * 4;
		randomFile.seek(byteNumber);
		ch = randomFile.readChar();
		System.out.println(ch);
		
	}

}
