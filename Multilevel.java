import java.util.Scanner;

class Hospital {
	String hnm, ha;

	void get1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hospital Name and Address");
		hnm = sc.next();
		ha = sc.next();
	}

	void put1() {
		System.out.println("Hospital Name=" + hnm + " " + "Address=" + ha);
	}
}

class patient extends Hospital {
	int pid, Wno;
	String nm;

	void get2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Patient Id,Name and Ward no");
		pid = sc.nextInt();
		nm = sc.next();
		Wno = sc.nextInt();
		
	}

	void put2() {
		System.out.println("PatientId=" + pid + " " + "Name=" + nm + " " + "Wardno=" + Wno);
	}
}

class Bill extends patient {
	int bid;
	float bamt;

	void get3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bill id and Amount");
		bid = sc.nextInt();
		bamt = sc.nextFloat();
	}

	void put3() {
		System.out.println("BillId=" + bid + " " + "Amount=" + bamt);
	}
}

public class Multilevel {

	public static void main(String[] args) {
		Bill b1 = new Bill();
		b1.get1();
		b1.get2();
		b1.get3();
		b1.put1();
		b1.put2();
		b1.put3();

	}

}
