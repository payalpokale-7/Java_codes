//super with member function
package abstractandinterface;

class Base3 {
	int x = 12;

	void show() {
		System.out.println("x=" + x);
	}
}

class Derived3 extends Base3 {
	int x = 25;

	void show() {
		super.show();
		System.out.println("x=" + x);
	}
}

public class Super4 {

	public static void main(String[] args) {
		Derived3 d1 = new Derived3();
		d1.show();
	}

}
