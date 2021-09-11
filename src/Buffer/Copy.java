package Buffer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("E:/copy.mp3");
		FileWriter writer = new FileWriter("E:/copy2.mp3");
		int ch;
		while ((ch=reader.read())!=-1) {
			writer.write(ch);
		}
		reader.close();
		writer.close();
	}
}
