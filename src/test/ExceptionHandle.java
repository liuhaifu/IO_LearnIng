package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionHandle {
	public static void main(String[] args) throws IOException {


		try(
				FileInputStream fis = new FileInputStream("aaa.txt");
	        	FileOutputStream fos = new FileOutputStream("bbb.txt");

				) {
			int len;
			byte[] arr = new byte[1024];
			while ((len=fis.read(arr))!=-1) {
				fos.write(len);
			}

		}










	}
}
