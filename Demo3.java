package file;
import java.io.*;
public class Demo3 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter a String");
		String s=br.readLine();
		System.out.println(s);
		System.out.println("Enter a no");
		String s1=br.readLine();
		int x=Integer.parseInt(s1);
		System.out.println("Square="+(x*x));
	}
}
