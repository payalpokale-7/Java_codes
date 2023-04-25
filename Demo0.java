//definition of static and default methods into interface
package abstractandinterface;
interface Three{
	static void show() {
		System.out.println("In show()");
	}
	default void display() {
		System.out.println("In display()");
	}
}


public class Demo0 implements Three {

	public static void main(String[] args) {
		Three t=new Demo0();
		t.display();
		Three.show();

	}

}
