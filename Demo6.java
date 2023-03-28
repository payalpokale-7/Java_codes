
class Base {
	Base()
	{
		System.out.println("In Default cons of Base");
	}
}
class Derived extends Base{
	Derived()
	{
		super();
		System.out.println("In Default cons of Derived");
	}
}
public class Demo6{
	public static void main(String[] args) {
		
			Derived d1=new Derived();
		
	}
}

