package file;
import java.io.*;
public class Demo5 {

	public static void main(String[] args) throws IOException {
		//writing into file
		FileOutputStream fos=new FileOutputStream("f5.txt");
		String s="Welcome to I/O programming";
		fos.write(s.getBytes());
		System.out.println("Success");
		fos.close();
		//Reading data from file
		FileInputStream fis=new FileInputStream("f5.txt");
		System.out.println("Reading from file...");
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.println((char)i);
		}
fis.close();
	}

}
