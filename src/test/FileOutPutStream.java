package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStream {
	public static void main(String[] args) {
		try {
			//如果没有3.txt,会创建出一个 如果有3.txt会先把里面的内容清空，再写入
			//在new FileOutputStream的第二个参数给一个true，则会续写文件里面的内容
			FileOutputStream fos = new FileOutputStream("E:/3.txt");
			fos.write(99);
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
