package java8;

{
	void display();
}
public class Demo3 {
	public void myMethod() {
		System.out.println("Instance Method");
	}

	public static void main(String[] args) {
		Demo3 obj=new Demo3();
		MyInterface ref=obj::myMethod();
		ref.display();

	}

}
