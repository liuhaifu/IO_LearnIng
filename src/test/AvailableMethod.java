package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;

public class AvailableMethod {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("E:/Deutschland Sucht den Superstar-Cry on My Shoulder.mp3");
			FileOutputStream fos = new FileOutputStream("E:/copy.mp3");
			int len = fis.available();
			byte[] arr = new byte[len]; //根据文件大小做一个字节数组
			fis.read(arr);
			fos.write(arr);

			fis.close();
			fos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
