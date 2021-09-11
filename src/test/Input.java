package test;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Input {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("test.txt");
		Scanner scanner = new Scanner(System.in);

		while(true) {
			String line = scanner.nextLine();
			if("quit".equals(line)) {
				break;
			}
			fos.write(line.getBytes());

		}
		fos.close();
	}
}
