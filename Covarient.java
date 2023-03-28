class Dash{
	Dash draw()
	{
		System.out.println("In Shape class draw()");
		return new Dash();
	}
}
class Triangle extends Dash
{
	Triangle draw()
	{
		System.out.println("In Circle class draw()");
		return null;
	
	}
}

public class Covarient {
	public static void main(String[] args) {
		Dash s1=new Triangle();
		s1.draw();
	}

}
