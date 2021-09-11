package Buffer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("E:/4.txt");
		writer.write("tulip 你好减肥了 造吗？");
		writer.close();
	}
}
