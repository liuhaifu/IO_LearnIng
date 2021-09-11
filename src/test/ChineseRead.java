package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ChineseRead {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("E:/3.txt");
			byte[] arr = new byte[4];
			int len;
			while((len=fis.read(arr))!=-1) {
				System.out.println(new String(arr,0,len,"GBK"));
			}

			fis.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}
	}
}
