package abstractandinterface;
import java.util.*;
public class ArrayDemo1 {
	int rno;
	String nm;
	float res;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rollno,Name and Result");
		rno=sc.nextInt();
		nm=sc.next();
		res=sc.nextFloat();
	}
	public void display() {
		System.out.println("Rollno="+rno+" "+"Name="+" "+nm+" "+"Result="+res);
	}

	public static void main(String[] args) {
		ArrayDemo1 a1=new ArrayDemo1();
		a1.accept();
		a1.display();

	}

}
