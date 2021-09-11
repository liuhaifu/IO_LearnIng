package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIleInputStream {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("E:/1.txt");

			/*int read1 = fis.read(); //一次读取一个字节 返回值是int
			System.out.println(read1);
			int read2 = fis.read(); //read 指针会向下移动 读到结尾的时候返回-1
			System.out.println(read2);*/
			int b;
			while((b=fis.read())!=-1)
				System.out.print(b);

			fis.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
