package Buffer;


import java.io.*;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("E:/4.txt"));
		ArrayList<String> list = new ArrayList<>();
		String line;
		while((line=bf.readLine())!=null) {
			list.add(line);
		}
		bf.close();

		BufferedWriter bw = new BufferedWriter(new FileWriter("E:/断桥残雪.txt"));

		for(int i=0;i<list.size();i++) {
			bw.write(list.get(i));
			bw.newLine();
		}
		bw.close();


	}

}
