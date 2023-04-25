package file;
import java.io.*;
public class Demo4 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		PrintWriter pw=new PrintWriter(System.out);
		System.out.println("Enter a string");
		String s1=br.readLine();
		pw.print(s1);
		System.out.println("Enter Double value");
		String s2=br.readLine();
		pw.write(s2);
		pw.flush();

	}

}
