//Dynamic Data method Dispatch
class Shape1{
	void draw()
	{
		System.out.println("In Shape class draw()");
	}
}
class Square extends Shape1
{
	void draw()
	{
		System.out.println("In Square class draw()");
	}
}

public class Ddmd {

	public static void main(String[] args) {
		Shape1 s1=new Square();
		s1.draw();
	}
}

