package abstractandinterface;

interface One {
	final int x = 10;

	public abstract void show();
}

interface Two {
	abstract void disp();
}

class Demo11 implements One, Two {

	@Override
	public void disp() {
		System.out.println("In Disp()");
	}

	@Override
	public void show() {
		System.out.println("In show()");

	}

}

public class Demo2 {

	public static void main(String[] args) {
		One o = new Demo11();
		Two t = new Demo11();
		o.show();
		t.disp();
	}

}
