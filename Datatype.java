import java.io.*;
import java.util.*;

public class Datatype {

	public static void main(String[] args) throws IOException 
	{
		{
			Scanner sc=new Scanner(System.in);
			int a;
			float b;
			char c;
			double d;
			String s;
			System.out.println("\nEnter int,float,char,double and String value");
			a=sc.nextInt();
			b=sc.nextFloat();
			c=(char)System.in.read();
			d=sc.nextDouble();
			s=sc.next();
			System.out.println(a+" "+b +" "+c+" "+d+" "+s);
		}

	}

}
