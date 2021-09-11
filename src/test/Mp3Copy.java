package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//非常慢的一种方式
/*public class Mp3Copy {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("E:/Deutschland Sucht den Superstar-Cry on My Shoulder.mp3");

			FileOutputStream fos = new FileOutputStream("copy.mp3");

			int  b;
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
}*/

public class Mp3Copy {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("E:/Deutschland Sucht den Superstar-Cry on My Shoulder.mp3");
			FileOutputStream fos = new FileOutputStream("E:/cooy.mp3");

			byte[] arr = new byte[1024];

			int len;
			while((len=fis.read(arr))!=-1) {
				fos.write(arr,0,len);
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
