//super with data member
package abstractandinterface;

class Base2 {
	int x = 12;
}

class Derived2 extends Base2 {
	int x = 25;

	void show() {
		System.out.println("x=" + this.x);
		System.out.println("x=" + super.x);
	}
}

public class Super3 {

	public static void main(String[] args) {
		Derived2 d1 = new Derived2();
		d1.show();

	}

}
