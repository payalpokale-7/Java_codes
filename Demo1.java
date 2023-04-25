package file;
import java.io.*;
import java.util.Date;
public class Demo1 {
	public static void main(String[] args) throws IOException {
		File f=new File("f1.txt");
		f.createNewFile();
		System.out.println("Success");
		System.out.println(f.length());
		System.out.println(new Date(f.lastModified()));
		System.out.println(f.exists());
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.isDirectory());
		f.renameTo(new File("f2.txt"));
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		f.delete();
		System.out.println(f.exists());
		File f1=new File("com");
		f1.mkdir();
		System.out.println("Success");
		String s[]=f1.list();
		for(String i:s)
		{
			System.out.println(i);
		}
		System.out.println(f1.exists());
		System.out.println(f1.isFile());
	}

}
