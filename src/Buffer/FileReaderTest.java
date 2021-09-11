package Buffer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("E:/4.txt");
		int ch;
		while((ch=reader.read())!=-1) {
			System.out.println((char) ch);
		}
		reader.close();
	}
}
