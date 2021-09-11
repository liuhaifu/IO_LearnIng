package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ChineseWrite {
	public static void main(String[] args) {
		try {
			FileOutputStream fis = new FileOutputStream("E:/4.txt");
			fis.write("你好".getBytes());
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
