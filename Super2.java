//super with parameter
package abstractandinterface;
class Base1
{
	Base1()
	{
		System.out.println("In Default cons of Base");
	}
	Base1(int x)
	{
		System.out.println("In Para cons of Base");
	}
}
class Derived1 extends Base1
{
	Derived1()
	{
		//super();
		System.out.println("In Default cons of Derived");
	}
	Derived1(int y)
	{
		super(5);
		System.out.println("In Para cons of Derived");
	}
}

public class Super2 {

	public static void main(String[] args) {
	Derived1 d1=new Derived1();
	Derived1 d2=new Derived1(10);

	}

}
