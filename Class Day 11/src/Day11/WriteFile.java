package Day11;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("D:\\test.txt");
		
		fw.write("Hello ");
		System.out.println("Sucess");
		fw.append("Java...!!!");
		fw.equals("Hello Java...!!!");
		fw.flush();
		fw.close();
		
		FileReader fr = new FileReader("D:\\test.txt");
		int i;
		while((i = fr.read())!=-1)
		{
			char ch = (char) i;
			System.out.print(ch);
		}
		fr.close();
		
	}

}
