package abstractandinterface;

import java.util.*;

public class Arrayobject {
	int rno;
	String nm;
	float res;

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rollno,Name and Result");
		rno = sc.nextInt();
		nm = sc.next();
		res = sc.nextFloat();
	}

	public void display() {
		System.out.println("Rollno=" + rno + " " + "Name=" + nm + " " + "Result=" + res);
	}

	public static void main(String[] args) {
		Arrayobject a[] = new Arrayobject[3];
		for (int i = 0; i < 3; i++) {
			a[i] = new Arrayobject();
			a[i].accept();
			a[i].display();
		}

	}

}
