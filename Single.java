import java.util.Scanner;

class Person {
	String nm, addr;

	void get1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name and Address");
		nm = sc.next();
		addr = sc.next();
	}
}

class S2 extends Person {
	int rno;
	float res;

	void get2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rollno and Result");
		rno = sc.nextInt();
		res = sc.nextFloat();
	}

	void show() {
		System.out.println("Rollno=" + rno + " " + "Name=" + nm + " " + "Address=" + addr + " " + "Result=" + res);
	}
}

public class Single {

	public static void main(String[] args) {
		S2 s1 = new S2();
		s1.get1();
		s1.get2();
		s1.show();

	}

}
