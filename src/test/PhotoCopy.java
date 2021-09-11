package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PhotoCopy {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("E:/1.png");
			FileOutputStream fos = new FileOutputStream("2.png");

			int b;
			while((b=fis.read())!=-1) {
				fos.write(b);
			}

			fis.close();
			fos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
