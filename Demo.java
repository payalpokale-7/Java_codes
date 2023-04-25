package exception;
import java.util.Scanner;
class ADemo{
	int x,y;
	void get() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 nos");
		x=sc.nextInt();
		y=sc.nextInt();
	}
	void put() {
		try {
			if(y==0)
				throw new ArithmeticException();
			else if(x<y)
				throw new Exception();
			else
				System.out.println("Div="+(x/y));
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Divide by 0 is not possible");
		}
		catch(Exception e)
		{
			System.out.println("First no. is smaller than Second No.");
		}
		finally
		{
			System.out.println("Thank you!!");
		}
		System.out.println("Add="+(x+y));
		System.out.println("Sub="+(x-y));
		System.out.println("Mult="+(x*y));
	}
}

public class Demo {

	public static void main(String[] args) {
		ADemo a1=new ADemo();
		a1.get();
		a1.put();
	}

}
