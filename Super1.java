//super with no parameter
package abstractandinterface;
class Base
{
	Base()
	{
		System.out.println("In Default cons of Base");
	}
}
class Derived extends Base
{
	Derived()
	{
		super();
		System.out.println("In Default cons of Derived");
	}
}

public class Super1 {

	public static void main(String[] args) {
		Derived d1=new Derived();

	}

}
