//Method Overloading

class ADemo{
	void area()
	{
		int r=10;
		System.out.println("Area of circle="+(3.14*r*r));
	}
	int area(int l,int b)
	{
		return(l*b);
	}
	float area(int b,float h)
	{
		return(0.5f*b*h);
	}
}



public class Demo7 {

	public static void main(String[] args) {
		ADemo a1=new ADemo();
		a1.area();
		System.out.println("Area of Rectangle="+a1.area(5, 6));
		System.out.println("Area of Triangle="+a1.area(3,2.5f ));
	}
}
