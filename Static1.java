//static member function
class SDemo{
	static int x=10;
	int y=10;
	static void show() {
		x++;
		System.out.println("x="+x);
	}
}
public class Static1 {

	public static void main(String[] args) {
		SDemo.show();
		SDemo.show();
		SDemo.show();
		SDemo.show();

	}

}

