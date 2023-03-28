import java.util.*;

class Vehicle
{
	int mno;
	String mnm;
	void get1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter vehicle no. and Name");
		mno=sc.nextInt();
		mnm=sc.next();
	}
	void put1()
	{
		System.out.println("Model Number="+mno+" "+"Name="+mnm);
	}
}

class TwoWheeler extends Vehicle{
	String tech;
	void get2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Technology for 2 wheeler");
		tech=sc.next();
	}
	void put2()
	{
		System.out.println("Technology="+tech);
	}
}

class FourWheeler extends Vehicle{
	String tech;
	void get3()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Technology for 4 wheeler");
		tech=sc.next();
	}
	void put3()
	{
		System.out.println("Technology="+tech);
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		TwoWheeler t1=new TwoWheeler();
		t1.get1();
		t1.get2();
		t1.put1();
		t1.put2();
		FourWheeler f1=new FourWheeler();
		f1.get1();
		f1.get3();
		f1.put1();
		f1.put3(); }
}
