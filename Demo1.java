package abstractandinterface;
abstract class ADemo
{
	int x=10;//normal variable
	ADemo()//constructor
	{
		
	}
	
	abstract void show();//abstract method
	public void diplay() {
		
		System.out.println("In display()");
	}
	
}
class Demo extends ADemo
{

	@Override
	void show() {
		System.out.println("In show()");
	}
		
	}

public class Demo1 {

	public static void main(String[] args) {
		ADemo a1=new Demo();
		a1.diplay();
		a1.show();

	}

}
