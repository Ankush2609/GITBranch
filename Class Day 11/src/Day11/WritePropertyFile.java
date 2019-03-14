package Day11;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WritePropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\ankus\\eclipse-workspace\\Class Day 11\\src\\Day11\\test.properties");
		Properties p = new Properties();
		p.setProperty("URL","https://www.google.com");
		p.setProperty("Username", "Ankush");
		p.setProperty("Password", "Test123");
		p.store(fw, "Comment");
		
		FileReader fr = new FileReader("C:\\Users\\ankus\\eclipse-workspace\\Class Day 11\\src\\Day11\\test.properties");
		p.load(fr);
		System.out.println(p.getProperty("Username"));
		System.out.println(p.getProperty("Password"));
		fw.close();

	}

}
