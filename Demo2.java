package file;
import java.io.*;
class FDemo
{
	void writeintoFile(String fn) throws IOException {
		RandomAccessFile raf=new RandomAccessFile(fn,"rw");
		String s="Java is developed by James";
		raf.seek(raf.length());
		raf.write(s.getBytes());
		System.out.println("Success");
		raf.close();
	}
void readfromfile(String fn) throws IOException
{
	RandomAccessFile raf=new RandomAccessFile(fn,"r");
	System.out.println("Reading from file...");
	int i;
	while((i=raf.read())!=-1) {
		System.out.println((char)i);
	}
}
}
public class Demo2 {

	public static void main(String[] args) throws IOException {
		FDemo f1=new FDemo();
		f1.writeintoFile("f3.txt");
		f1.readfromfile("f3.txt");
	}

}
