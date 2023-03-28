//Variable arguments and for each loop
class VDemo{
	void show(int...x)//ellipses .. we can provide n no of parameters
	{
		for (int i : x)
		{
			System.out.println(i);
		}
	}
}


public class Demo11 {
public static void main(String[] args) {
	VDemo v1 = new VDemo();
	v1.show();
	v1.show(1,2,3);
	v1.show(10,20,30,40,50,60,70,80,90,100);
}
}
