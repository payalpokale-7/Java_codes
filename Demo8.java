//Method Overloading
class Shape{
	void draw()
	{
		System.out.println("In Shape class draw()");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("In circle class draw()");
	}
}

public class Demo8 {

	public static void main(String[] args) {
		Circle c1=new Circle();
		c1.draw();
	}
}
